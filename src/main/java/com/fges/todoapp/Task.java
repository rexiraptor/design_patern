package com.fges.todoapp;

public class Task {
    private String name;
    private Boolean done;

    //other things

    public Task(String name, Boolean done) {
        this.name = name;
        this.done = done;
    }

    public Boolean getDone() {
        return done;
    }

    public String getName() {
        return name;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    public void setName(String name) {
        this.name = name;
    }
}
