package com.example.springkafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({"com.example.config", "com.example.controller"})
public class SpringKafkaApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringKafkaApplication.class, args);
    }
}
