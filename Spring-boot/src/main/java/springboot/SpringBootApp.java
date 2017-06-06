package springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@SpringBootApplication
public class SpringBootApp {

	@Bean
	public InternalResourceViewResolver getInternalResourceViewResolver() {
		InternalResourceViewResolver res = new InternalResourceViewResolver();
		res.setSuffix(".html");
		return res;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootApp.class, args);
	}

}
