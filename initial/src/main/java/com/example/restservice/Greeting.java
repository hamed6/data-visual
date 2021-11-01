package com.example.restservice;

public class Greeting {
    public  final long id;
    public final String content;

    public Greeting(long id, Sting content){
        this.id=id;
        this.content=content;
    }

    public long getID(){
        return id;
    }
    public String getContent(){
        return content;
    }
}