package com.ly.kafka.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Producer;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {
	
	private KafkaTemplate<String,String> kafka;
	
	private static final Logger Logger=LoggerFactory.getLogger(KafkaProducer.class);

	public KafkaProducer(KafkaTemplate<String, String> kafka) {
		super();
		this.kafka = kafka;
	}
	
	public void sendMessage(String message) {
		Logger.info(String.format("Message send %s", message));
		kafka.send("java-topic",message);
	}
	

}
