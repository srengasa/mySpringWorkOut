package springboot.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/greetings")
	public String sayHello(Map<String, Object> map) {
		System.out.println("This is a sample spring boot app");
		map.put("UserName", "Sudharsan");
		return "Hello";
	}
	
}
