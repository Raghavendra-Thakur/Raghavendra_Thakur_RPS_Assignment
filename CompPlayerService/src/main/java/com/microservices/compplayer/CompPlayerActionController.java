package com.microservices.compplayer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompPlayerActionController {
	
	
	private Logger logger = LoggerFactory.getLogger(CompPlayerActionController.class);	
	
	@GetMapping(value = "computer/action")
	public String getCompPlayerAction() {
		String str = "";
		
		logger.info("Request -> computer/action");
		
		int num = (int) (Math.random()*3 - 1 + 1)+1; 
		
		switch(num) {
			case 1:
				return "ROCK";
			case 2:
				return "PAPER";
			case 3:
			    return "SCISSORS";
		  default:
			  	return "error";
		}
		
		
	}
	
}
