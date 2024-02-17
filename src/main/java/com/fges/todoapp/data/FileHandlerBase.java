package com.fges.todoapp.data;
import com.fges.todoapp.taskmanager.Task;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
//class représentant la structure que dois avoir tout type de fichier que l'on veut pouvoir supproter
public interface  FileHandlerBase {
     void insert(List<Task> tasks, Path filePath) throws IOException;

    List<Task> list( String fileContent) throws IOException;

}
