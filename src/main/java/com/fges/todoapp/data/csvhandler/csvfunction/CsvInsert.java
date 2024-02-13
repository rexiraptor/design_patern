package com.fges.todoapp.data.csvhandler.csvfunction;

import com.fges.todoapp.presentation.settingsprovider.CommandGetFileContent;
import com.fges.todoapp.presentation.settingsprovider.CommandGetFilePath;
import com.fges.todoapp.taskmanager.Task;
import com.fges.todoapp.taskmanager.TaskCreator;
import org.apache.commons.cli.CommandLine;

import java.io.IOException;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CsvInsert {

    private static final Logger LOGGER = Logger.getLogger(CsvInsert.class.getName());

    public static void insert( CommandLine cmd) {
        try {

                var fileContent= CommandGetFileContent.getFileContent(cmd);

                TaskCreator taskCreator = new TaskCreator();

                Task task = taskCreator.creator(cmd);

                if (!fileContent.endsWith("\n") && !fileContent.isEmpty()) {
                    fileContent += "\n";
                }
                fileContent += task.getName() +"|" + task.getDone();

                Files.writeString(CommandGetFilePath.getFilePath(cmd), fileContent);

        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Error writing to file", e);
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error during insertion", e);
        }
    }
}
