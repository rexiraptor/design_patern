package com.fges.todoapp.data.csvhandler;

import com.fges.todoapp.data.csvhandler.csvfunction.CsvInsert;
import com.fges.todoapp.data.csvhandler.csvfunction.CsvList;
import com.fges.todoapp.data.FileHandlerBase;
import com.fges.todoapp.taskmanager.Task;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

//class regroupant les fonctions pour les différente action possible sur un fichier csv
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

