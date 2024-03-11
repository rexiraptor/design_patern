package com.fges.todoapp.logic.commandhandler.action.webaction;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fges.todoapp.data.file.FileHandlerBase;
import com.fges.todoapp.data.file.FileHandlerFactory;
import com.fges.todoapp.data.web.*;
import com.fges.todoapp.logic.commandhandler.action.CommandAction;
import com.fges.todoapp.presentation.settingsprovider.CommandGetFileContent;
import com.fges.todoapp.presentation.settingsprovider.CommandGetOpt;
import com.fges.todoapp.taskmanager.Task;
import org.apache.commons.cli.CommandLine;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class WebStartAction implements CommandAction {
    @Override
    public void execute(CommandLine cmd) throws IOException, InterruptedException {

        TaskProvider taskProvider = new TaskProvider();
        DummyCrudEndpoint<Task> endpoint = new DummyCrudEndpoint<>("task", taskProvider, Task.class);
        try {
            endpoint.run(8080);








            HttpClient client = HttpClient.newHttpClient();
            // Créer un objet ObjectMapper pour sérialiser l'objet Task
            ObjectMapper objectMapper = new ObjectMapper();

            // Créer un objet Task à envoyer
            //Task task = new Task("Example Task", true);
            FileHandlerFactory fileHandlerFactory = new FileHandlerFactory();
            FileHandlerBase fileHandler = fileHandlerFactory.createFileHandler(CommandGetOpt.getOptionValue(cmd, "s"));

            List<Task> task = fileHandler.list(CommandGetFileContent.getFileContent(cmd));



            // Sérialiser l'objet Task en JSON
            String json = objectMapper.writeValueAsString(task);

            // Créer la requête POST avec le corps JSON
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("http://localhost:8080/task")) // Utilisez l'URL de votre serveur
                    .header("Content-Type", "application/json")
                    .POST(HttpRequest.BodyPublishers.ofString(json))
                    .build();

            // Envoyer la requête et obtenir la réponse
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Afficher la réponse du serveur
            System.out.println(response.body());













            Thread.currentThread().join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IOException("Server was interrupted", e);
        }
    }
}
