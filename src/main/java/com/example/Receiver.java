package com.example;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

//Message Driven Pojo
@Component
public class Receiver {
		
	// destination that this method listen and container Factory will referecne to JMSContainerFactory
	// container is not necessary unless you need to customize way Spring boot register default factory 
	@JmsListener(destination = "inmemeory.dummy.queue")
	public void receiveMessave(String message) {
		System.out.println("Recivied Message  --" + message);
	}
	
 	
}
