package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class KafkaController {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @GetMapping("/send/{msg}")
    public String send(@PathVariable("msg") String msg) {
        kafkaTemplate.send("test01",msg);
        return "success";
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello springboot!";
    }
}
