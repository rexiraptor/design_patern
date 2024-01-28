package com.fges.todoapp.FileHandler.JsonHandler;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fges.todoapp.FileHandler.FileHandlerBase;
import com.fges.todoapp.FileHandler.JsonHandler.JsonFunction.IsJson;
import com.fges.todoapp.FileHandler.JsonHandler.JsonFunction.JsonInsert;
import com.fges.todoapp.FileHandler.JsonHandler.JsonFunction.JsonList;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class JsonFileBase implements FileHandlerBase {

    @Override
    public void insert(List<String> positionalArgs, String fileName, String fileContent, Path filePath) throws IOException {
        JsonInsert.insert(positionalArgs,  fileContent, filePath);
    }

    @Override
    public void list(String fileContent) throws JsonProcessingException {
        JsonList.list(fileContent);
    }


    public static boolean isJson(String fileName){
        return IsJson.isJson(fileName);
    }

}

