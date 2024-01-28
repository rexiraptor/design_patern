package com.fges.todoapp.FileHandler.CsvHandler.CsvFunction;

public class IsCsv {
    public static boolean isCsv(String fileName){
        return fileName.endsWith(".csv");
    }
}
