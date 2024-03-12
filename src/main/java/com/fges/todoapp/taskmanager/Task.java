package com.fges.todoapp.taskmanager;


// Class representing the structure of a task
public class Task {
    private  String name;
    private  Boolean done;

    public Task(String name,Boolean done) {
        this.name = name;
        this.done = done;
    }

    //for jackson
    public Task(){}


    public String getName() {
        return name;
    }

    public Boolean getDone(){ return done;}


}
