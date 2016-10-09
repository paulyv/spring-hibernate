package com.pauli.varelius.spring.demo.core;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeleafController {

	@RequestMapping("/index")
	public String index() {
		return "index";
	}
}
