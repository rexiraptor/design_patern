package com.fges.todoapp.presentation.settingsprovider;

//class qui renvoie l'extension d'un fichier
public class CommandGetFileExtension {
    public static String getFileExtension(String fileName){
        return fileName.substring(fileName.lastIndexOf(".") + 1).toLowerCase();
    }
}
