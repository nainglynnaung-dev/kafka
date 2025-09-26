package com.ly.kafka.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.messaging.support.MessageHeaderInitializer;
import org.springframework.stereotype.Service;

import com.ly.kafka.payload.User;

@Service
public class JsonKafkaProducer {
	
	private static final Logger Logger=LoggerFactory.getLogger(JsonKafkaProducer.class);
	
	private final KafkaTemplate<String,User> tem;

	public JsonKafkaProducer(KafkaTemplate<String, User> tem) {
		super();
		this.tem = tem;
	}
	
	
	public void sendMessage(User data) {
		Logger.info(String.format("Message send with user -> %s", data.toString()));
		Message<User> message=MessageBuilder.withPayload(data).setHeader(KafkaHeaders.TOPIC,"java-t").build();
		tem.send(message);
	}

}
