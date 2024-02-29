package com.example.kafkaexample.repository;

import com.example.kafkaexample.entity.KafkaMessagesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KafkaMessageRepository extends JpaRepository<KafkaMessagesEntity,Long> {
}
