package com.fges.todoapp.data.file;

import com.fges.todoapp.data.file.csvhandler.CsvFileBase;
import com.fges.todoapp.data.file.jsonhandler.JsonFileBase;

import java.util.HashMap;
import java.util.Map;

public class FileHandlerMap {

    // HashMap that contains the names of the file extensions with which the application works,
    // and their associated "FileHandlerBase"
    public static Map<String, FileHandlerBase> createSupportedHandlersMap() {
        final Map<String, FileHandlerBase> handlerMap = new HashMap<>();
        handlerMap.put("csv", new CsvFileBase());
        handlerMap.put("json", new JsonFileBase());
        return handlerMap;
    }
}