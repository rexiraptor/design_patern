package com.fges.todoapp.data.web;

import com.fges.todoapp.taskmanager.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskProvider implements CrudProvider<Task>{

    private List<Task> tasks = new ArrayList<>();

    @Override
    public void add(List<Task> task) {
        tasks.addAll(task);
    }

    @Override
    public List<Task> list() {
        return tasks;
    }
}
