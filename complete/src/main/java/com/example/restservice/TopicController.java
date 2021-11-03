package com.example.restservice;
import com.example.restservice.TopicService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController{

    @Autowired 
    private TopicService topicService;

    @RequestMapping("/topic")
    public String getall(){
        return "all topic";
    }

    
    @GetMapping("/topics")
    public List<Topic> getallTopics(){
        return topicService.getAlltopics();
    }
    

}