package com.fges.todoapp.FileHandler.JsonHandler.JsonFunction;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.MissingNode;
import com.fges.todoapp.TaskManager.Task;
import com.fges.todoapp.TaskManager.TaskCreator;
import org.apache.commons.cli.CommandLine;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class JsonInsert {
    public static void insert(String fileContent, Path filePath, CommandLine cmd) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        JsonNode actualObj = mapper.readTree(fileContent);
        if (actualObj instanceof MissingNode) {
            actualObj = JsonNodeFactory.instance.arrayNode();
        }

        if (actualObj instanceof ArrayNode arrayNode) {

            TaskCreator taskCreator = new TaskCreator();

            Task newTask = taskCreator.creator(cmd);

            JsonNode taskNode = mapper.valueToTree(newTask);

            arrayNode.add(taskNode);
        }

        Files.writeString(filePath, actualObj.toString());
    }
}
