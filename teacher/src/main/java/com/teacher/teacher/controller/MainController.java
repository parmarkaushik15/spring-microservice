package com.teacher.teacher.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@RequestMapping(value = "/")
	public String teacher() {
		return "Welcome To Teacher API!";
	}
	
}
