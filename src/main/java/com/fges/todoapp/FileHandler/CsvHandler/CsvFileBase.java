package com.fges.todoapp.FileHandler.CsvHandler;

import com.fges.todoapp.FileHandler.CsvHandler.CsvFunction.CsvInsert;
import com.fges.todoapp.FileHandler.CsvHandler.CsvFunction.CsvList;
import com.fges.todoapp.FileHandler.CsvHandler.CsvFunction.IsCsv;
import com.fges.todoapp.FileHandler.FileHandlerBase;

import java.nio.file.Path;
import java.util.List;

public class CsvFileBase implements FileHandlerBase {

    @Override
    public void insert(List<String> positionalArgs, String fileName, String fileContent, Path filePath)  {
        CsvInsert.insert(positionalArgs,  fileContent, filePath);
    }

    @Override
    public void list(String fileContent) {
        CsvList.list(fileContent);
    }


    public static boolean isCsv(String fileName){
        return IsCsv.isCsv(fileName);
    }

}

