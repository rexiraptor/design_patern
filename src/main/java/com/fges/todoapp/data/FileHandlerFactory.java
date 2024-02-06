package com.fges.todoapp.data;

import com.fges.todoapp.data.csvhandler.CsvFileBase;
import com.fges.todoapp.data.jsonhandler.JsonFileBase;

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
