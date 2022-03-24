package com.azure.tradeoff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App {

	@GetMapping("/getmessage")
	public String getMessage() {
		return " Returning from getMessage api ... ";
	}

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
