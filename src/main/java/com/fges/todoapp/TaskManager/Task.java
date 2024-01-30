package com.fges.todoapp.TaskManager;

public class Task {
    private String name;
    private Boolean done;

    public Task(String name,Boolean done) {
        this.name = name;
        this.done = done;
    }

    public String getName() {
        return name;
    }

    public Boolean getDone(){ return done;}
}
