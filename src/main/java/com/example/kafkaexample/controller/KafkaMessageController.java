package com.example.kafkaexample.controller;

import com.example.kafkaexample.dto.MessageRequest;
import com.example.kafkaexample.producer.KafkaProducer;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@RequiredArgsConstructor
@RequestMapping("api/v1/messages")
public class KafkaMessageController {

   private final KafkaProducer kafkaProducer;


    @PostMapping
    public void publish(@RequestBody MessageRequest messageRequest) {
        log.info("Starting publishing the message" + messageRequest.getMessage());
        kafkaProducer.sendMessage(messageRequest.getMessage());
    }
}
