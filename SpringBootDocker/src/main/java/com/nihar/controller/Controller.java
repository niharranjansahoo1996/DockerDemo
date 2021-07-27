package com.nihar.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	public String getmsg() {
		return "Welcome.";
	}
	
}
