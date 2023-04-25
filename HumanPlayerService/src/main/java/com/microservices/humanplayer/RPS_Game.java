package com.microservices.humanplayer;

import org.springframework.stereotype.Component;

@Component
public class RPS_Game {

	public GameResponse rpsGame(String humanAction , String computerAction ) {
		GameResponse gameResponse = new GameResponse();
		
		String winner ="";
		
		if(humanAction.equalsIgnoreCase("rock") || humanAction.equalsIgnoreCase("paper") || humanAction.equalsIgnoreCase("scissors") ) {
		
		
		if (computerAction.equalsIgnoreCase(humanAction)) {
			winner = "It is a tie";
		}
		
        if( computerAction.equalsIgnoreCase( "rock" ) && humanAction.equalsIgnoreCase( "scissors" ) ){
            winner = "Computer wins";
           
        }else if( humanAction.equalsIgnoreCase( "rock" ) && computerAction.equalsIgnoreCase( "scissors" ) ){
            winner = "Player wins";    
        }

        if( computerAction.equalsIgnoreCase( "scissors" ) && humanAction.equalsIgnoreCase( "paper" ) ){
            winner = "Computer wins";
           
        }else if( humanAction.equalsIgnoreCase( "scissors" ) && computerAction.equalsIgnoreCase( "paper" ) ){
            winner = "Player wins";
            
        }

        if( computerAction.equalsIgnoreCase( "paper" ) && humanAction.equalsIgnoreCase( "rock" ) ){
            winner = "Computer wins";
            
        }else if( humanAction.equalsIgnoreCase( "paper" ) && computerAction.equalsIgnoreCase( "rock" ) ){
            winner = "Player wins";
            
        }
		}
		else {
			winner = "please enter one of this 1.rock 2.paper 3.scissors";
			gameResponse.setResult(winner);
			return gameResponse;
		}
		
        
        gameResponse.setComputerAction(computerAction);
        gameResponse.setHumanAction(humanAction.toUpperCase());
        gameResponse.setResult(winner);
        
		return gameResponse;
	}
	
}
