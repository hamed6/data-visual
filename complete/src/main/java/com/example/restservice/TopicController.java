package com.example.restservice;
import com.example.restservice.TopicService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController{

    @Autowired 
    private TopicService topicService;

    @GetMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id){
        return topicService.getTopic(id);
    }

    
    @GetMapping("/topics")
    public List<Topic> getallTopics(){
        return topicService.getAlltopics();
    }


    

}