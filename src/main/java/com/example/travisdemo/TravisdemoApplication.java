package com.example.travisdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TravisdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TravisdemoApplication.class, args);
	}

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello World";
	}
	
	@GetMapping("/hi")
	public String sayHi() {
		return "Hi World";
	}
	
	
}
