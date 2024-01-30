package com.fges.todoapp.FileHandler.CsvHandler.CsvFunction;

import com.fges.todoapp.TaskManager.Task;
import com.fges.todoapp.TaskManager.TaskCreator;
import org.apache.commons.cli.CommandLine;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CsvInsert {

    private static final Logger LOGGER = Logger.getLogger(CsvInsert.class.getName());

    public static void insert( String fileContent, Path filePath, CommandLine cmd) {
        try {

                TaskCreator taskCreator = new TaskCreator();

                Task task = taskCreator.creator(cmd);

                if (!fileContent.endsWith("\n") && !fileContent.isEmpty()) {
                    fileContent += "\n";
                }
                fileContent += task.getName() +" | " + task.getDone();

                Files.writeString(filePath, fileContent);

        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Error writing to file", e);
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error during insertion", e);
        }
    }
}
