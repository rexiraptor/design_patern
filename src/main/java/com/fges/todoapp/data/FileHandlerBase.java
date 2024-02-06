package com.fges.todoapp.data;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.apache.commons.cli.CommandLine;

import java.io.IOException;
import java.nio.file.Path;
public interface  FileHandlerBase {
     void insert(String fileName, String fileContent, Path filePath, CommandLine cmd) throws IOException;

    void list(String fileContent, CommandLine cmd) throws JsonProcessingException;

}
