package exo2.streams;

import exo2.beans.ContactHelper;
import exo2.flow.ContactPublisher;
import exo2.flow.ContactSubscriber;

public class AppMain {

	public static void main(String[] args) throws InterruptedException {
		// construction du pipeline
		ContactPublisher publisher = new ContactPublisher();
		var contacts = ContactHelper.getContacts();
		try(publisher){
			ContactSubscriber subscriber = new ContactSubscriber(3);
			publisher.subscribe(subscriber);
			contacts.forEach(publisher::submit);
			while (subscriber.getLimit() > 0) {
				Thread.sleep(500);
			}
		}

	}

}
