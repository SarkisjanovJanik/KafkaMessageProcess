package com.example.kafkaexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaMessageProcessor {

    public static void main(String[] args) {
        SpringApplication.run(KafkaMessageProcessor.class, args);
    }

}
