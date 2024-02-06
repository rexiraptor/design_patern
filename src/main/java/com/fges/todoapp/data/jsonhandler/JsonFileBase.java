package com.fges.todoapp.data.jsonhandler;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fges.todoapp.data.FileHandlerBase;
import com.fges.todoapp.data.csvhandler.csvfunction.CsvList;
import com.fges.todoapp.data.jsonhandler.jsonfunction.IsJson;
import com.fges.todoapp.data.jsonhandler.jsonfunction.JsonInsert;
import com.fges.todoapp.data.jsonhandler.jsonfunction.JsonList;
import com.fges.todoapp.logic.PrintManager;
import org.apache.commons.cli.CommandLine;

import java.io.IOException;
import java.nio.file.Path;

public class JsonFileBase implements FileHandlerBase {

    @Override
    public void insert(String fileName, String fileContent, Path filePath, CommandLine cmd) throws IOException {
        JsonInsert.insert(fileContent, filePath, cmd);
    }

    @Override
    public void list(String fileContent,CommandLine cmd) throws JsonProcessingException {
        PrintManager printManager =new PrintManager();
        printManager.printList(
                JsonList.list(fileContent),
                cmd
        );
    }


    public static boolean isJson(String fileName){
        return IsJson.isJson(fileName);
    }

}

