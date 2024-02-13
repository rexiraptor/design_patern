package com.fges.todoapp.data.jsonhandler.jsonfunction;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.MissingNode;
import com.fges.todoapp.presentation.settingsprovider.CommandGetFileContent;
import com.fges.todoapp.presentation.settingsprovider.CommandGetFilePath;
import com.fges.todoapp.taskmanager.Task;
import com.fges.todoapp.taskmanager.TaskCreator;
import org.apache.commons.cli.CommandLine;

import java.io.IOException;
import java.nio.file.Files;

public class JsonInsert {
    public static void insert(CommandLine cmd) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        JsonNode actualObj = mapper.readTree(CommandGetFileContent.getFileContent(cmd));
        if (actualObj instanceof MissingNode) {
            actualObj = JsonNodeFactory.instance.arrayNode();
        }

        if (actualObj instanceof ArrayNode arrayNode) {

            TaskCreator taskCreator = new TaskCreator();

            Task newTask = taskCreator.creator(cmd);

            JsonNode taskNode = mapper.valueToTree(newTask);

            arrayNode.add(taskNode);
        }

        Files.writeString(CommandGetFilePath.getFilePath(cmd), actualObj.toString());
    }
}
