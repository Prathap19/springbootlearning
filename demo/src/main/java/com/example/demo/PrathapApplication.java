package com.example.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrathapApplication {

	@RequestMapping("/helloworld")
	public String sayhelloworld() {
		return "Greetings from Spring Boot!";
	}

}



