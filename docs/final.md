# L3 Design Pattern Report
**Firstname:** Nicolas  
**Lastname:** DODART  

## Adding a Command
To add a command to the program, you need to:
- Add a file that inherits from `CommandAction`. In this file, you should describe the logic of the function (what will it do?).
- Don't forget to add the name of your command in the `CommandHandlerMap` (following the example of the lines above). At the end of the command name, do not forget to add the name of the source (e.g., `File` if it's for a file).
- Feel free to add functions in the "Base" files (e.g., `FileHandlerBase`) as needed (do not forget to adhere to the SOLID method—see the `csvhandler` and `jsonhandler` folders for examples).

## Adding a New File Type Support
To add support for a new file type:
- In the `file` folder, create a folder with the name of the new file type you are supporting (take an example from the existing ones).
- Make a file that inherits from `FileHandlerBase` and include all the necessary functions (`List` and `Insert` as of this document writing) and code them! 
- Do not forget to adhere to the SOLID method (see the `csvhandler` and `jsonhandler` folders for examples).

## Adding a New Data Source
To add a new data source (interface or non-file data source, for example):
- Add a folder in the `data` file named after the new type of source.
- Add how to recognize this new type of data in the `SourceIdentifier`.
- To add commands to this type of source, see: how to add a new command.

## Adding an Attribute to a Task
To add an attribute to a task, you need to:
- Add the attribute to the `Task` class and create a getter (do as for the other attributes).
- Do not forget to manage the attribute in the `TaskCreator` class.

---
