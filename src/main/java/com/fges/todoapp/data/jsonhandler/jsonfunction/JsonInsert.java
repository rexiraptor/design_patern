package com.fges.todoapp.data.jsonhandler.jsonfunction;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.MissingNode;
import com.fges.todoapp.presentation.settingsprovider.CommandGetFileContent;
import com.fges.todoapp.taskmanager.Task;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class JsonInsert {
    public static void insert(List<Task> tasks, Path filePath) throws IOException {

        var fileContent = CommandGetFileContent.getFileContent(filePath);
        ObjectMapper mapper = new ObjectMapper();
        JsonNode actualObj = mapper.readTree(fileContent);
        if (actualObj instanceof MissingNode) {
            actualObj = JsonNodeFactory.instance.arrayNode();
        }

        if (actualObj instanceof ArrayNode arrayNode) {
            for (Task task : tasks) {
                JsonNode taskNode = mapper.valueToTree(task);
                arrayNode.add(taskNode);
            }
        }

        Files.writeString(filePath, actualObj.toString());
    }
}
