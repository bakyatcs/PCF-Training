package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageService {
	
	
	
	@GetMapping("/hello")
	public String sayHello() {
		return "hello";
	}
	
	@GetMapping("/sum")
	public int sum() {
		return 15+15;
	}
	
	
	@GetMapping("/subtract")
	public int subtract() {
		return 15-14;
	}
	
	  @GetMapping("/multiply") public int multiply() { return 15*15; }
	  
	  
	  @GetMapping("/divide") public int divide() { return 15/15; }
	  
	  
	  @GetMapping("/null") public String nullCheck() { return null; }
	  
	 
}