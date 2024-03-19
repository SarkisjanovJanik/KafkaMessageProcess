package com.example.kafkaexample.producer;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.kafka.core.KafkaTemplate;

@Component
@RequiredArgsConstructor
public class KafkaProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;


    public void sendMessage (String message) {
        kafkaTemplate.send("messageList", message);
    }
}
