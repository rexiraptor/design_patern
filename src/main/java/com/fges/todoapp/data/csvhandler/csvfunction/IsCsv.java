package com.fges.todoapp.data.csvhandler.csvfunction;

public class IsCsv {
    public static boolean isCsv(String fileName){
        return fileName.endsWith(".csv");
    }
}
