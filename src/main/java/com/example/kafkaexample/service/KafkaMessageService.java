package com.example.kafkaexample.service;

import com.example.kafkaexample.dto.MessageRequest;
import com.example.kafkaexample.repository.KafkaMessageRepository;
import com.example.kafkaexample.entity.KafkaMessagesEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class KafkaMessageService {

    private final KafkaMessageRepository kafkaMessageRepository;



    public void processMessage(String messageData) {
        KafkaMessagesEntity message = new KafkaMessagesEntity();
        message.setMessage(messageData);

        kafkaMessageRepository.save(message);
    }
}


