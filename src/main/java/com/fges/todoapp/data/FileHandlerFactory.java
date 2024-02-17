package com.fges.todoapp.data;

import com.fges.todoapp.presentation.settingsprovider.CommandGetFileExtension;

import java.util.Map;
//class renvoyant le bon handler de fichier en fonction de son extension a partir d'un hasmap
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


