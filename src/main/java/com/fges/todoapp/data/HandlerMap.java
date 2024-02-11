package com.fges.todoapp.data;

import com.fges.todoapp.data.csvhandler.CsvFileBase;
import com.fges.todoapp.data.jsonhandler.JsonFileBase;

import java.util.HashMap;
import java.util.Map;

public class HandlerMap {

    //HashMap qui contient le nom des extensions de fichier avec lesquelle l'application fonctionne,
    // et leurs "FileHandlerBase" associé
    public static Map<String, FileHandlerBase> createSupportedHandlersMap() {
        final Map<String, FileHandlerBase> handlerMap = new HashMap<>();
        handlerMap.put("csv", new CsvFileBase());
        handlerMap.put("json", new JsonFileBase());
        return handlerMap;
    }
}