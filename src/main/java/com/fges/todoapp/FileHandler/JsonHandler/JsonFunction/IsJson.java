package com.fges.todoapp.FileHandler.JsonHandler.JsonFunction;

public class IsJson {
    public static boolean isJson(String fileName){
        return fileName.endsWith(".json");
    }

}
