package com.tim.remotecontrol.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

@Component
public class KakfaPeoducer {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    public void send(String msg){
        System.out.println("Send data");
        kafkaTemplate.send("kafka",msg);
    }
}
