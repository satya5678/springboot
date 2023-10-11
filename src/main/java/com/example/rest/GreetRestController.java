package com.example.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRestController {

	Logger logger = LoggerFactory.getLogger(GreetRestController.class);

	@GetMapping("/greet")
	public String getWelcomeMsg() {

		logger.info("greetMethod Execution Started");

		String msg = "Good Morning";


		logger.info("greetMethod Execution Ended");

		return msg;
	}
}
