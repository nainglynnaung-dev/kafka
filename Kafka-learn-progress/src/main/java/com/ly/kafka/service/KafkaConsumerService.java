package com.ly.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {
	
	@KafkaListener(topics = "my-topic",groupId = "my-group")
	public void listen(String message) {
		System.out.println("Reciving Message is %s ".formatted(message));
		
	}

}
