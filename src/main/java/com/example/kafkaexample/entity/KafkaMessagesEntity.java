package com.example.kafkaexample.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


@Entity
@Table (name = "kafkaMessages")
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class KafkaMessagesEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "message")
    public String message;

}
