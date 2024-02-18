package com.fges.todoapp.presentation.settingsprovider;

// Class that returns the extension of a file
public class CommandGetFileExtension {
    public static String getFileExtension(String fileName){
        return fileName.substring(fileName.lastIndexOf(".") + 1).toLowerCase();
    }
}
