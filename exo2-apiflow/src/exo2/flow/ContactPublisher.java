package exo2.flow;

import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.SubmissionPublisher;
import java.util.logging.Logger;

import exo2.streams.Contact;

public class ContactPublisher extends SubmissionPublisher<Contact> {
	static Logger logger  = Logger.getLogger(ContactPublisher.class.getPackageName());

	@Override
	public void subscribe(Subscriber<? super Contact> subscriber) {
		super.subscribe(subscriber);
		logger.info("Subscribe : 1 abonné en plus");
	}

	
}
