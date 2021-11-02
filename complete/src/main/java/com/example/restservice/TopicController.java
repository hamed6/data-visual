package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController{
    
    @RequestMapping("/topic")
    public String getall(){
        return "all topic";
    }

    @RequestMapping("/topics")
    public List<Topic> getAlltopics(){
        return Arrays.asList(
            new Topic("car one", "this car can be audi a1"),
            new Topic("car two", "this car can be audi a2")
            );
    }
}