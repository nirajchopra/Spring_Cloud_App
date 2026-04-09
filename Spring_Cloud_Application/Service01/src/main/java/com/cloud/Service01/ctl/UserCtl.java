package com.cloud.Service01.ctl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "User")
public class UserCtl {
	
	@GetMapping("display")
	public String display() {
		return "Service01 in display";
	}
	
	@PostMapping("Submit")
	public String submit() {
		return "Service01 in Submit";
	}

}
