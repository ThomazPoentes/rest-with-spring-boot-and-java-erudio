package br.com.erudio.brincadeiras;

import java.util.concurrent.atomic.AtomicLong;

import br.com.erudio.brincadeiras.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	private static final String TEMPALTE = "Hello, %s!";
	private static final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/greenting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "word")String name) {
		return new Greeting(counter.incrementAndGet(), String.format(TEMPALTE, name));
	} 
	//http://localhost:8081/greenting?name=Thomaz
}
