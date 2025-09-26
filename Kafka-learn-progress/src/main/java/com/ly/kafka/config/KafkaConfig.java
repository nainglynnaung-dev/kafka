package com.ly.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {
	
	@Bean
	public NewTopic javaguidesTopic() {
		return TopicBuilder.name("java-topic").partitions(10).build();
	}
	@Bean
	public NewTopic javatopic() {
		return TopicBuilder.name("java-t").partitions(10).build();
	}

}
