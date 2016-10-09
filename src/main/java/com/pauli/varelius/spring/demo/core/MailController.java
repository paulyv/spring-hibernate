package com.pauli.varelius.spring.demo.core;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pauli.varelius.spring.demo.mail.MailSender;
import com.pauli.varelius.spring.demo.mail.MockMailSender;

@RestController
public class MailController {

	@Resource
	private MailSender mailSender;
	
	@RequestMapping("/mail")
	public String sendMail() {
		mailSender.send("abc@gmail.com", "hello mail", "this is a test");
		return "mail sent!";
	}
}
