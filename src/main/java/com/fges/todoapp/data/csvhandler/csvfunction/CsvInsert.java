package com.fges.todoapp.data.csvhandler.csvfunction;

import com.fges.todoapp.presentation.settingsprovider.CommandGetFileContent;
import com.fges.todoapp.taskmanager.Task;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CsvInsert {
    // Class that is used to write a list of tasks into a CSV file
    private static final Logger LOGGER = Logger.getLogger(CsvInsert.class.getName());

    public void insert(List<Task> tasks, Path filePath) {
        try {
            StringBuilder fileContent = new StringBuilder(CommandGetFileContent.getFileContent(filePath));

            if (!fileContent.toString().endsWith("\n") && (!fileContent.isEmpty())) {
                fileContent.append("\n");
            }

            for (Task task : tasks) {
                fileContent.append(task.getName()).append("|").append(task.getDone()).append("\n");
            }

            Files.writeString(filePath, fileContent.toString());

        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Error writing to file", e);
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error during insertion", e);
        }
    }
}
