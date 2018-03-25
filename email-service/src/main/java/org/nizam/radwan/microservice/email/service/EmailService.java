package org.nizam.radwan.microservice.email.service;


public interface EmailService {

	public void send(String to, String subject, String text);

}
