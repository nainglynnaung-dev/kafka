package com.ly.kafka.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ly.kafka.kafka.KafkaProducer;

@RestController
@RequestMapping("/api/v1/kafka")
public class KafkaController {
	
	@Autowired
	private KafkaProducer ser;
	
	private static final Logger Logger=LoggerFactory.getLogger(KafkaController.class);
	//http://localhost:8080/api/v1/kafka/public?message=Hello World This is myine
	@GetMapping("/public")
	public String message(@RequestParam(value = "message") String message) {
		ser.sendMessage(message);
		Logger.info(String.format("Message sent %s", message));
		return "Message sent to Kafka Topic";
	}

}
