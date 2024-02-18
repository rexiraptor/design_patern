package com.fges.todoapp.data;

import com.fges.todoapp.data.csvhandler.CsvFileBase;
import com.fges.todoapp.data.jsonhandler.JsonFileBase;

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