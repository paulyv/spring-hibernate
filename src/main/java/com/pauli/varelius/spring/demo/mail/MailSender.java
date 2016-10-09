package com.pauli.varelius.spring.demo.mail;

public interface MailSender {

	void send(String to, String subject, String body);

}