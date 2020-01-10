package exo2.flow;

import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;
import java.util.logging.Logger;

import exo2.streams.Contact;

public class ContactSubscriber implements Subscriber<Contact> {
	
	static Logger logger = Logger.getLogger(ContactSubscriber.class.getPackageName());
	
	protected Subscription subscription;
	protected Integer limit;
	
	

	public ContactSubscriber(final int limit) {
		super();
		this.limit = limit;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public void onSubscribe(Subscription subscription) {
		this.subscription = subscription;
		logger.info("onSubscribe : abonné !");
		subscription.request(1L);
		
	}

	public void onNext(Contact item) {
		logger.info("onNext :"+item);
		limit--;
		if(limit>0) {
			subscription.request(1L);
		}
		else {
			subscription.cancel();
		}
	
		
	}

	public void onError(Throwable throwable) {
		logger.severe(throwable.getMessage());
		
	}

	public void onComplete() {
		logger.info("onComplete");
		
	}

}
