package com.fges.todoapp.FileHandler.CsvHandler;

import com.fges.todoapp.FileHandler.CsvHandler.CsvFunction.CsvInsert;
import com.fges.todoapp.FileHandler.CsvHandler.CsvFunction.CsvList;
import com.fges.todoapp.FileHandler.CsvHandler.CsvFunction.IsCsv;
import com.fges.todoapp.FileHandler.FileHandlerBase;
import org.apache.commons.cli.CommandLine;

import java.nio.file.Path;

public class CsvFileBase implements FileHandlerBase {

    @Override
    public void insert(String fileName, String fileContent, Path filePath, CommandLine cmd)  {
        CsvInsert.insert(fileContent, filePath, cmd);
    }

    @Override
    public void list(String fileContent) {
        CsvList.list(fileContent);
    }


    public static boolean isCsv(String fileName){
        return IsCsv.isCsv(fileName);
    }

}

