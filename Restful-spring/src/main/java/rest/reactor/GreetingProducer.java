package rest.reactor;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.bus.Event;
import reactor.bus.EventBus;

@Service
public class GreetingProducer {

	@Autowired
	private EventBus eventBus;
	
	@Autowired
	private CountDownLatch latch;
	
	public void publishQuotes(int numberOfQuotes) throws InterruptedException {
		AtomicInteger i = new AtomicInteger(1);
		
		for (int j = 1; j < numberOfQuotes; j++) {
			System.out.println("Notify quote : " + i.get());
			eventBus.notify("quotes", Event.wrap(String.valueOf(i.getAndIncrement())));
			System.out.println("Notified Quotes next val:" + i.get());
		}
		System.out.println("End of notify");
	}
}
