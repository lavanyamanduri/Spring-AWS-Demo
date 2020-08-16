package com.bridgelabz.aws.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AwsController {

@GetMapping("/demo")
public String hello() 
{
return "welcome to aws demo";
}
}


	
	
	

