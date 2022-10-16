package com.firstSpringBoot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloControler {
	
	@RequestMapping("/hello")
	public String sayHi() {
		return "Hi User...";
	}

}
