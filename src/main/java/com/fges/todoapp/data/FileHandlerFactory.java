package com.fges.todoapp.data;

import com.fges.todoapp.presentation.settingsprovider.CommandGetFileExtension;

import java.util.Map;

// Class returning the correct file handler based on its extension from a hashmap
public class FileHandlerFactory {
    private final Map<String, FileHandlerBase> handlerMap;

    public FileHandlerFactory (){
        this.handlerMap=FileHandlerMap.createSupportedHandlersMap();
    }
    public FileHandlerBase createFileHandler(String fileName) {
        String fileExtension = CommandGetFileExtension.getFileExtension(fileName);
        if (handlerMap.containsKey(fileExtension)) {
            return handlerMap.get(fileExtension);
        } else {
            throw new UnsupportedOperationException("unsuported extension" + fileName);
        }
    }
}


