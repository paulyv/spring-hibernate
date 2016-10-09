package com.pauli.varelius.spring.demo.core;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeleafDataController {

	@RequestMapping("/thymeleafData")
	public String data(Model someData) {
		// Datan indentifier eka ja sit itse data.
		someData.addAttribute("jotainDataa", "Tää on data");
		return "index";
		
	}
}
