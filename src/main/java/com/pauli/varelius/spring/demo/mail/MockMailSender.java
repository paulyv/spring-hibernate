package com.pauli.varelius.spring.demo.mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

@Component
public class MockMailSender implements MailSender {

	private static final Log Log = LogFactory.getLog(MockMailSender.class);
	
	/* (non-Javadoc)
	 * @see com.pauli.varelius.spring.demo.mail.MailSender#send(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public void send(String to, String subject, String body) {
		Log.info("Sending mail to " + to);
		Log.info("Subject: " + subject);
		Log.info("Body: " + body);
	}
}
