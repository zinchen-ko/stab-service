package com.kostya.stabservice.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class StabService {
    @KafkaListener(topics="msg")
    public void msgListener(String msg){
        System.out.println(msg);
    }
}
