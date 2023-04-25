package com.microservices.humanplayer;

public class GameResponse {
	private String humanAction;
	private String computerAction;
	private String result;
	
	
	
	public GameResponse() {
		
	}


	public GameResponse(String humanAction, String computerAction, String result) {
		super();
		this.humanAction = humanAction;
		this.computerAction = computerAction;
		this.result = result;
	}


	public String getHumanAction() {
		return humanAction;
	}


	public void setHumanAction(String humanAction) {
		this.humanAction = humanAction;
	}


	public String getComputerAction() {
		return computerAction;
	}


	public void setComputerAction(String computerAction) {
		this.computerAction = computerAction;
	}


	public String getResult() {
		return result;
	}


	public void setResult(String result) {
		this.result = result;
	}
	
	
	
	
	
}
