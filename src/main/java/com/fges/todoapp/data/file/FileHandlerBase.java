package com.fges.todoapp.data.file;
import com.fges.todoapp.taskmanager.Task;
import java.io.IOException;
import java.util.List;
// Class representing the structure that any type of file we want to be supported on the app must have
public interface  FileHandlerBase {
     void insert(List<Task> tasks, String source) throws IOException;

    List<Task> list( String fileContent) throws IOException;

}
