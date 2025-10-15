package com.kafka.guidekafka.infrastructure.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "topic-java", groupId = "myGroup")
    public void consume(String message){
        log.info("Received message: {}", message);

    }
}
