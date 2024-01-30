package com.fges.todoapp.FileHandler;

import com.fges.todoapp.FileHandler.CsvHandler.CsvFileBase;
import com.fges.todoapp.FileHandler.JsonHandler.JsonFileBase;

import java.util.Optional;

public class FileHandlerFactory {

    public Optional<FileHandlerBase> createFileHandler(String fileName) {
        if (CsvFileBase.isCsv(fileName)) {
            return Optional.of(new CsvFileBase());
        } else if (JsonFileBase.isJson(fileName)) {
            return Optional.of(new JsonFileBase());
        } else {
            return Optional.empty();
        }
    }
}
