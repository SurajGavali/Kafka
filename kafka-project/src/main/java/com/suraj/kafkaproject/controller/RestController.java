package com.suraj.kafkaproject.controller;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api/suraj")
public class RestController {
    private KafkaTemplate<String,String> kafkaTemplate;

    public RestController(KafkaTemplate<String,String> kafkaTemplate){
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping
    public void publish(@RequestBody com.suraj.kafkaproject.record.RequestBody requestBody){
        kafkaTemplate.send("surajTopic_IN",requestBody.message());
    }
}
