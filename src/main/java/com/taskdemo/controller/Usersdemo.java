package com.taskdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Usersdemo {
	@GetMapping("/add")
	public String add(@RequestParam("a")String str1,@RequestParam("b")String str2) {
		return str1+str2;
	}
	

}
