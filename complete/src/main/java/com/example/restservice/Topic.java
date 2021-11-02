package com.example.restservice;




public class Topic {
    public String id;
    public String name;
    

    public Topic(){

    }

    public Topic(String id, String name){
        super();
        this.id=id;
        this.name=name;
    }

    public String getID (){
        return id;
    }

    public String getName (){
        return name;
    }

    public void  setID (String id){
        this.id=id;
    }

    public void  setName (String name){
        this.name=name;
    }
}


