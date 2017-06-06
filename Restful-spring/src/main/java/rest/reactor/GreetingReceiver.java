package rest.reactor;

import java.util.concurrent.CountDownLatch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import reactor.bus.Event;
import reactor.fn.Consumer;
import rest.model.Greeting;

@Service
public class GreetingReceiver implements Consumer<Event<String>> {

	@Autowired
	private CountDownLatch latch;
	
	@Override
	public void accept(Event<String> event) {
		Greeting g = new RestTemplate().getForObject("http://localhost:8080/greetings", Greeting.class);
		System.out.println(g);
		latch.countDown();
	}

}
