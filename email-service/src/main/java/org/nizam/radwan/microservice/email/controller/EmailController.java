package org.nizam.radwan.microservice.email.controller;
import org.nizam.radwan.microservice.commons.model.EmailMessage;
import org.nizam.radwan.microservice.email.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

	@Autowired
	EmailService emailService;
	
    @RequestMapping(path="/send", method=RequestMethod.POST)
    public void send(@RequestBody(required=true) EmailMessage emailMessage) {
    	emailService.send(emailMessage.getTo(), emailMessage.getSubject(), emailMessage.getBody());
    }
}