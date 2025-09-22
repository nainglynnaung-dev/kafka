package com.ly.kafka.service;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {
	
	private final KafkaTemplate<String,String> template;
	
	public KafkaProducerService(KafkaTemplate<String,String> template) {
		this.template=template;
		
	}
	
	public void sendMessage(String mes) {
		template.send("my-topic",mes);
	}
	
	

}
