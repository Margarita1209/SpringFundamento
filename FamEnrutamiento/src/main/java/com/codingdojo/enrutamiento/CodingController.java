package com.codingdojo.enrutamiento;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class CodingController {
	
	@RequestMapping("/coding")
	public String Hello() {
		return "¡Hola Coding Dojo!";
	}
	
	@RequestMapping("/coding/python")
	public String python() {
		return "¡Python/Django fue increíble!";
	}
	
	@RequestMapping("/coding/java")
	public String java() {
		return "¡Java/Spring es mejor!";
	}
	
}
