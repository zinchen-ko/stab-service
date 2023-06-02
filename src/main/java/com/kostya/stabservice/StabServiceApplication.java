package com.kostya.stabservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class StabServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(StabServiceApplication.class, args);
    }

}
