package com.fges.todoapp.data.jsonhandler;

import com.fges.todoapp.data.FileHandlerBase;
import com.fges.todoapp.data.jsonhandler.jsonfunction.JsonInsert;
import com.fges.todoapp.data.jsonhandler.jsonfunction.JsonList;
import com.fges.todoapp.taskmanager.Task;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class JsonFileBase implements FileHandlerBase {

    @Override
    public void insert(List<Task> tasks , Path filePath) throws IOException {
        JsonInsert.insert(tasks, filePath);

    }

    @Override
    public List<Task> list(String fileContent) throws IOException {
            return JsonList.list(fileContent);
    }
}

