package com.pauli.varelius.spring.demo.core;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")
		public String Hello() {
			return "Hello World!";
	}
}
