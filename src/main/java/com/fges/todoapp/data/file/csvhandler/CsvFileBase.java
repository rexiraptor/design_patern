package com.fges.todoapp.data.file.csvhandler;

import com.fges.todoapp.data.file.csvhandler.csvfunction.CsvInsert;
import com.fges.todoapp.data.file.csvhandler.csvfunction.CsvList;
import com.fges.todoapp.data.file.FileHandlerBase;
import com.fges.todoapp.taskmanager.Task;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

// Class grouping the functions for the different possible actions on a CSV file
public class CsvFileBase implements FileHandlerBase {

    @Override
    public void insert(List<Task> tasks, Path filePath)  {
        CsvInsert csvInsert =new CsvInsert();
        csvInsert.insert(tasks, filePath);
    }

    @Override
    public List<Task> list(String fileContent) throws IOException {
        CsvList csvList = new CsvList();
        return csvList.list(fileContent);
    }

}

