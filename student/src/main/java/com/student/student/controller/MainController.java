package com.student.student.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@RequestMapping(value = "/")
	public String student() {
		return "Welcome To Student API!";
	}
	
}
