package com.example.controller;


import com.example.model.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="kafka")
public class PublishMessageController {


    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    private KafkaTemplate<String, People> peopleKafkaTemplate;


    @RequestMapping(value="publish/{message}", method= RequestMethod.GET)
    public String post(@PathVariable String message) {
        kafkaTemplate.send("test", "key", message);

        return "Published successfully";
    }


    @RequestMapping(value="publish/name/{name}", method=RequestMethod.GET)
    public String postUser(@PathVariable String name) {
        peopleKafkaTemplate.send("test", "key", new People(name, name));
        return "Published People successfully";
    }

    @RequestMapping(value="hello", method=RequestMethod.GET)
    public String hello() {
        return "hello";
    }

}
