package rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import rest.model.Greeting;

@RestController
public class GreetingsController {

	@RequestMapping("/greetings")
	public Greeting getGreetings() {
		String id = String.valueOf((int)((1+Math.random())*100));
		Greeting g = new Greeting(id, "Hello " + id + " ! ");
		return g;
	}
}
