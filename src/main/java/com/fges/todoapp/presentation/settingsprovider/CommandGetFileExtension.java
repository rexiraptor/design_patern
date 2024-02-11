package com.fges.todoapp.presentation.settingsprovider;

public class CommandGetFileExtension {
    public static String getFileExtension(String fileName){
        return fileName.substring(fileName.lastIndexOf(".") + 1).toLowerCase();
    }
}
