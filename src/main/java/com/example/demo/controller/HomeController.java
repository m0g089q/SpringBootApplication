package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/demo1")
	public String sayHi(){
		return "Hello Muthu";
	}
	
}
