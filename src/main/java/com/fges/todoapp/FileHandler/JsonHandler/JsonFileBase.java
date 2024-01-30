package com.fges.todoapp.FileHandler.JsonHandler;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fges.todoapp.FileHandler.FileHandlerBase;
import com.fges.todoapp.FileHandler.JsonHandler.JsonFunction.IsJson;
import com.fges.todoapp.FileHandler.JsonHandler.JsonFunction.JsonInsert;
import com.fges.todoapp.FileHandler.JsonHandler.JsonFunction.JsonList;
import org.apache.commons.cli.CommandLine;

import java.io.IOException;
import java.nio.file.Path;

public class JsonFileBase implements FileHandlerBase {

    @Override
    public void insert(String fileName, String fileContent, Path filePath, CommandLine cmd) throws IOException {
        JsonInsert.insert(fileContent, filePath, cmd);
    }

    @Override
    public void list(String fileContent) throws JsonProcessingException {
        JsonList.list(fileContent);
    }


    public static boolean isJson(String fileName){
        return IsJson.isJson(fileName);
    }

}

