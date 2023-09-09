package com.suraj.kafkaproject.kafka;

import org.springframework.stereotype.Component;

@Component
public class KafkaListener {

    @org.springframework.kafka.annotation.KafkaListener(topics = "surajTopic_IN",groupId = "groupId")
    void listener(String data){
        System.out.println("data from kafka topic is :: "+data);
    }
}
