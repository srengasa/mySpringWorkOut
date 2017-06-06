package rest.config;

import java.util.concurrent.CountDownLatch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import reactor.Environment;
import reactor.bus.EventBus;
import rest.reactor.GreetingProducer;
import rest.reactor.GreetingReceiver;

import static reactor.bus.selector.Selectors.$;

@SpringBootApplication(scanBasePackages={"rest"})
public class ApplicationConfig implements CommandLineRunner {

	private static final int numberOfQuotes = 10;
	
	@Bean
	public Environment env() {
		return Environment.initializeIfEmpty().assignErrorJournal();
	}
	
	@Bean
	public EventBus createEventBus(Environment env) {
		return EventBus.create(env, Environment.THREAD_POOL);
	}
	
	@Bean(name="latch")
	public CountDownLatch getCountDownLatch() {
		return new CountDownLatch(numberOfQuotes);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ApplicationConfig.class, args);
	}
	
	@Autowired
	private EventBus eventBus;
	
	@Autowired
	private GreetingReceiver greetingReceiver;
	
	@Autowired
	private GreetingProducer greetingProducer;
	
	@Override
	public void run(String... arg0) throws Exception {
		eventBus.on($("quotes"), greetingReceiver);
		greetingProducer.publishQuotes(numberOfQuotes - 3);
	}

}
