package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo1Controller {
	@GetMapping("/hey")
	public String hey() {
		return "Hello World";
	}
}
