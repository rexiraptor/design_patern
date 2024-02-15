package com.fges.todoapp.data.csvhandler;

import com.fges.todoapp.data.csvhandler.csvfunction.CsvInsert;
import com.fges.todoapp.data.csvhandler.csvfunction.CsvList;
import com.fges.todoapp.data.FileHandlerBase;
import com.fges.todoapp.taskmanager.Task;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class CsvFileBase implements FileHandlerBase {

    @Override
    public void insert(List<Task> tasks, Path filePath)  {

        CsvInsert.insert(tasks, filePath);
    }

    @Override
    public List<Task> list(String fileContent) throws IOException {
        return CsvList.list(fileContent);
    }

}

