package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class ClinicController{
@GetMapping(value="/")
public String welcome(){
	return "Dr Shawn pet clinic";
	}
}
