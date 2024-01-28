package com.fges.todoapp.FileHandler.JsonHandler.JsonFunction;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.MissingNode;
import com.fges.todoapp.Task;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class JsonInsert {
    public static void insert(List<String> positionalArgs, String fileContent, Path filePath) throws IOException {
        if (positionalArgs.size() < 2) {
            System.err.println("Missing Task name");
            return;
        }
        String taskName = positionalArgs.get(1);

        ObjectMapper mapper = new ObjectMapper();
        JsonNode actualObj = mapper.readTree(fileContent);
        if (actualObj instanceof MissingNode) {
            actualObj = JsonNodeFactory.instance.arrayNode();
        }

        if (actualObj instanceof ArrayNode arrayNode) {
            Task newTask = new Task(taskName);

            JsonNode taskNode = mapper.valueToTree(newTask);

            arrayNode.add(taskNode);
        }

        Files.writeString(filePath, actualObj.toString());
    }
}
