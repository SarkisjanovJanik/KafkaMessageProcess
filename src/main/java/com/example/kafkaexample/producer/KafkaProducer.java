package com.example.kafkaexample.producer;

import com.example.kafkaexample.dto.MessageRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class KafkaProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;


    public void sendMessage (String message) {
        kafkaTemplate.send("messageList", message);
    }
}
