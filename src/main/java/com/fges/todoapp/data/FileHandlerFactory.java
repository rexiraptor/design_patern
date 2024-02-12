package com.fges.todoapp.data;

import com.fges.todoapp.presentation.settingsprovider.CommandGetFileExtension;

import java.util.Map;
import java.util.Optional;

public class FileHandlerFactory {
    private final Map<String, FileHandlerBase> handlerMap;

    public FileHandlerFactory (){
        this.handlerMap=FileHandlerMap.createSupportedHandlersMap();
    }
    public Optional<FileHandlerBase> createFileHandler(String fileName) {
        String fileExtension = CommandGetFileExtension.getFileExtension(fileName);
        if (handlerMap.containsKey(fileExtension)) {
            return Optional.of(handlerMap.get(fileExtension));
        } else {
            return Optional.empty();
        }
    }
}


