package com.fges.todoapp.data;
import org.apache.commons.cli.CommandLine;

import java.io.IOException;
public interface  FileHandlerBase {
     void insert(CommandLine cmd) throws IOException;

    void list( CommandLine cmd) throws IOException;


}
