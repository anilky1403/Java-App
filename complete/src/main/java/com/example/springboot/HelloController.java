package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Autowired
	fetch ft;

	@GetMapping("/")
	public String index() {
		String str = ft.getDetails();
		System.out.println("str "+str);
		return "Greetings from Spring Boot"+str;
	}

}
