package com.fges.todoapp.data.jsonhandler.jsonfunction;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.MissingNode;
import com.fges.todoapp.taskmanager.Task;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class JsonList {
    public static List<Task> list(String fileContent) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode actualObj = mapper.readTree(fileContent);

        // Handle missing or non-array JSON nodes by returning an empty list
        if (!(actualObj instanceof ArrayNode arrayNode)) {
            return Collections.emptyList();
        }

        // Process ArrayNode to create a list of Task objects
        return StreamSupport.stream(arrayNode.spliterator(), false)
                .map(node -> new Task(node.get("name").asText(), node.get("done").asBoolean()))
                .collect(Collectors.toList());
    }
}
