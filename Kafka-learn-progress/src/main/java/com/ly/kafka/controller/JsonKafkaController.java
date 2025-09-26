package com.ly.kafka.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ly.kafka.kafka.JsonKafkaProducer;
import com.ly.kafka.payload.User;

@RestController
@RequestMapping("/api/v1/kafka")
public class JsonKafkaController {
	
	private final JsonKafkaProducer jkp;

	public JsonKafkaController(JsonKafkaProducer jkp) {
		super();
		this.jkp = jkp;
	}
	
	@PostMapping("/json")
	public ResponseEntity<String> send(@RequestBody User user){
		jkp.sendMessage(user);
		return ResponseEntity.ok("Kafka json is Successfully send");
		
	}
	
	

}
