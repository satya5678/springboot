package com.example.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	
	Logger logger = LoggerFactory.getLogger(WelcomeRestController.class);
	
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		
		logger.info("getWelcomeMethod Execution Started");
		
		String msg = "WELCOME TO JRTP";
		
		
		logger.info("getWelcomeMethod Execution Ended");
		
	     return msg;
	}

}
