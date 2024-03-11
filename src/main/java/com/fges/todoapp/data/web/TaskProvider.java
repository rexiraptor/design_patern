package com.fges.todoapp.data.web;

import com.fges.todoapp.taskmanager.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskProvider implements CrudProvider<Task>{

    private final List<Task> tasks = new ArrayList<>();

    @Override
    public void add(Task task) {
        tasks.add(task);
    }

    @Override
    public List<Task> list() {
        return tasks;
    }
}
