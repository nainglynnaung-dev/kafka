package com.ly.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ly.kafka.service.KafkaProducerService;

@RestController
@RequestMapping("/kafka")
public class KafkaController {
	
	@Autowired
	private KafkaProducerService ser;
	
	@PostMapping("/send")
	public String message(@RequestParam(value = "message") String message) {
		ser.sendMessage(message);
		return "Message sent to Kafka Topic";
	}

}
