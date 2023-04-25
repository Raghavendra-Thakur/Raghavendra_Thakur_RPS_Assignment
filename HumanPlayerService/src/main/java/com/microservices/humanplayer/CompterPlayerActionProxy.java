package com.microservices.humanplayer;

import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(name = "computer-player")
public interface CompterPlayerActionProxy{
	
	@GetMapping(value = "computer/action")
	public String getCompPlayerAction();
}
