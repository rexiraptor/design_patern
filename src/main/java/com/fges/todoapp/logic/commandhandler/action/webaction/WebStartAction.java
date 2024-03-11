package com.fges.todoapp.logic.commandhandler.action.webaction;

import com.fges.todoapp.data.file.FileHandlerBase;
import com.fges.todoapp.data.file.FileHandlerFactory;
import com.fges.todoapp.data.web.*;
import com.fges.todoapp.logic.commandhandler.action.CommandAction;
import com.fges.todoapp.presentation.settingsprovider.CommandGetFileContent;
import com.fges.todoapp.presentation.settingsprovider.CommandGetOpt;
import com.fges.todoapp.taskmanager.Task;
import org.apache.commons.cli.CommandLine;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

public class WebStartAction implements CommandAction {
    @Override
    public void execute(CommandLine cmd) throws IOException {

        String source = CommandGetOpt.getOptionValue(cmd, "s");

        TaskProvider taskProvider = new TaskProvider();
        DummyCrudEndpoint<Task> endpoint = new DummyCrudEndpoint<>("task", taskProvider, Task.class);
        try {
            endpoint.run(8080);

            //la
            PostTask postTask = new PostTask();

            FileHandlerFactory fileHandlerFactory = new FileHandlerFactory();
            FileHandlerBase fileHandler = fileHandlerFactory.createFileHandler(source);

            List<Task> tasks = fileHandler.list(CommandGetFileContent.getFileContent(Paths.get(source)));


            for (Task task : tasks) {
                postTask.Post(task);
            }

            Thread.currentThread().join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IOException("Server was interrupted", e);
        }
    }
}
