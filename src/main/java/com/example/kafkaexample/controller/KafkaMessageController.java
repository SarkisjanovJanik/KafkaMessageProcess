package com.example.kafkaexample.controller;

import com.example.kafkaexample.dto.MessageRequest;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@RequestMapping("api/v1/messages")
public class KafkaMessageController {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public KafkaMessageController(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping
    public void publish(@RequestBody MessageRequest messageRequest) {
        log.info("Starting publishing the message" + messageRequest.getMessage());
        kafkaTemplate.send("messageList", messageRequest.getMessage());
    }
}
