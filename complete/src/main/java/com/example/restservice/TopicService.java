package com.example.restservice;
import org.springframework.stereotype.Service;
// import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;


@Service
public class TopicService{
    
    private List<Topic> topics = Arrays.asList(
        new Topic("car one", "this car can be audi a1"),
        new Topic("car two", "this car can be audi a2")
    );

     public List<Topic> getAlltopics(){
         return topics;
        }
}