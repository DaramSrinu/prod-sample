package com.sampl.prod.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleProdTestController {
	
	@GetMapping("/get/{name}")
	public String userName(@PathVariable String name) {
		return "welcome to Railway Cloud "+name;
		
	}

}
