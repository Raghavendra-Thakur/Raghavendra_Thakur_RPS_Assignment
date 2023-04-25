package com.microservices.humanplayer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HumanPlayerController {
	
	@Autowired
	private CompterPlayerActionProxy proxy;
	@Autowired
	private RPS_Game game;
	
	private Logger logger = LoggerFactory.getLogger(HumanPlayerController.class);	
	
	@GetMapping(value = "/human/action/{action}")
	public GameResponse getGameResult(@PathVariable("action") String humanAction) {
		
		logger.info("Request -> /human/action/{} ", humanAction);
		
		String computerAction = proxy.getCompPlayerAction();
		
		
		
		GameResponse gameResponse = game.rpsGame(humanAction, computerAction);
		
		
		
		return gameResponse;
		
	}
	
}
