package com.demo.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

//@Component
public class ConsumerService {
//    @KafkaListener(topics = { "test01" })
    public void receiveMessage(ConsumerRecord<String, String> record) {
        System.out.println("【*** 接收消息 ***】key = " + record.key() + "、value = " + record.value());
    }

}
