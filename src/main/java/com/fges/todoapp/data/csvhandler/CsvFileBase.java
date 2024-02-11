package com.fges.todoapp.data.csvhandler;

import com.fges.todoapp.data.csvhandler.csvfunction.CsvInsert;
import com.fges.todoapp.data.csvhandler.csvfunction.CsvList;
import com.fges.todoapp.data.FileHandlerBase;
import com.fges.todoapp.logic.PrintManager;
import org.apache.commons.cli.CommandLine;

import java.nio.file.Path;

public class CsvFileBase implements FileHandlerBase {

    @Override
    public void insert(String fileName, String fileContent, Path filePath, CommandLine cmd)  {
        CsvInsert.insert(fileContent, filePath, cmd);
    }

    @Override
    public void list(String fileContent, CommandLine cmd) {
        PrintManager printManager =new PrintManager();
        printManager.printList(
                CsvList.list(fileContent),
                cmd
        );

    }



}

