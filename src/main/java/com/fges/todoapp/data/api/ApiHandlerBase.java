package com.fges.todoapp.data.api;

import com.fges.todoapp.taskmanager.Task;
import java.util.List;

public interface ApiHandlerBase {
    List<Task> fetchTasks() throws Exception;

    void sendTask(Task task) throws Exception;
}
//Implementation of each of these functions with respect to the different interfaces to manage?