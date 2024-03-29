package com.fges.todoapp.data.file.jsonhandler.jsonfunction;

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
import java.nio.file.Paths;
import java.util.List;
// Class that is used to write a list of tasks into a JSON file
public class JsonInsert {
    public void insert(List<Task> tasks, String source) throws IOException {

        Path filePath = Paths.get(source);

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
