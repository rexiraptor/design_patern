package com.fges.todoapp.data.jsonhandler;

import com.fges.todoapp.data.FileHandlerBase;
import com.fges.todoapp.data.jsonhandler.jsonfunction.JsonInsert;
import com.fges.todoapp.data.jsonhandler.jsonfunction.JsonList;
import com.fges.todoapp.logic.PrintManager;
import com.fges.todoapp.presentation.settingsprovider.CommandGetFileContent;
import org.apache.commons.cli.CommandLine;

import java.io.IOException;

public class JsonFileBase implements FileHandlerBase {

    @Override
    public void insert( CommandLine cmd) throws IOException {
        JsonInsert.insert(cmd);
    }

    @Override
    public void list(CommandLine cmd) throws IOException {
        PrintManager printManager =new PrintManager();
        printManager.printList(
                JsonList.list(CommandGetFileContent.getFileContent(cmd)),
                cmd
        );
    }
}

