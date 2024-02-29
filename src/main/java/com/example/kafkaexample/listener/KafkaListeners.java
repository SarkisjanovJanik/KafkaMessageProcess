package com.example.kafkaexample.listener;

import com.example.kafkaexample.dto.MessageRequest;
import com.example.kafkaexample.service.KafkaMessageService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Log4j2
@AllArgsConstructor
public class KafkaListeners {

    private final KafkaMessageService kafkaMessageService;

    @KafkaListener(topics = "messageList", groupId = "groupId")
    void listen(String data) {
        log.info("Listener has received the message: " + data);
        kafkaMessageService.processMessage(data);
    }
}
