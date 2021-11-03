package com.example.restservice;
import org.springframework.stereotype.Service;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Filter;


@Service
public class TopicService{
    
    private List<Topic> topics = Arrays.asList(
        new Topic("one", "this car can be audi a1"),
        new Topic("two", "this car can be audi a2")
    );

    public List<Topic> getAlltopics(){
        return topics;
    };

    public Topic getTopic(String id){
        return topics.stream().filter(t -> t.getID().equals(id)).findFirst().get();
    }

}