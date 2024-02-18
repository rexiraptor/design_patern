package com.fges.todoapp.data.bdd;

import com.fges.todoapp.taskmanager.Task;
import java.util.List;

//
public interface DataHandlerBase {
    void insert(List<Task> tasks) throws Exception;
    List<Task> list() throws Exception;
}

