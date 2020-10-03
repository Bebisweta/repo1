package com.nt.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelComeControllor {
	
	private static final Logger logger=LoggerFactory.getLogger(WelComeControllor.class);

	@GetMapping("/getmsg")
	public String getMsg() {
		logger.info("started getMsg() method");
		String msg="WelCome to SpringBoot Logging!!...";
		logger.info("ended getMsg() method");
		return msg;
		
	}

}
