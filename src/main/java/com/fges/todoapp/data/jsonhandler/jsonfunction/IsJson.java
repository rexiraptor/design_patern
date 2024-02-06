package com.fges.todoapp.data.jsonhandler.jsonfunction;

public class IsJson {
    public static boolean isJson(String fileName){
        return fileName.endsWith(".json");
    }

}
