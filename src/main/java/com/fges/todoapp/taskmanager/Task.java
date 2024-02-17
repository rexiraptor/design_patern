package com.fges.todoapp.taskmanager;

//class qui représente la structure d'une tache
public class Task {
    private final String name;
    private final Boolean done;

    public Task(String name,Boolean done) {
        this.name = name;
        this.done = done;
    }

    public String getName() {
        return name;
    }

    public Boolean getDone(){ return done;}
}
