package com.fges.todoapp.data;

import com.fges.todoapp.data.csvhandler.CsvFileBase;
import com.fges.todoapp.data.jsonhandler.JsonFileBase;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class FileHandlerFactory {
    private static final Map<String, FileHandlerBase> handlerMap = new HashMap<>();

    static {
        handlerMap.put("csv", new CsvFileBase());
        handlerMap.put("json", new JsonFileBase());
        // Ajoutez d'autres gestionnaires ici
    }

    public Optional<FileHandlerBase> createFileHandler(String fileName) {
        // Extraire l'extension du fichier
        String fileExtension = fileName.substring(fileName.lastIndexOf(".") + 1).toLowerCase();

        if (handlerMap.containsKey(fileExtension)) {
            return Optional.of(handlerMap.get(fileExtension));
        } else {
            return Optional.empty();
        }
    }
}
