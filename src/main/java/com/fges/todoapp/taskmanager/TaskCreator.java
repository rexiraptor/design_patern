package com.fges.todoapp.taskmanager;


import com.fges.todoapp.presentation.settingsprovider.GetTodoName;
import com.fges.todoapp.presentation.settingsprovider.GetOptDone;
import org.apache.commons.cli.CommandLine;

//class créent une tache a partir de la command line( permet de ne pas changer la créeation de tache
//dans tout les file handler si on veut potentielement changer leur format ou rajouter des options, genre une date de création)
public class TaskCreator {
    public Task creator(CommandLine cmd) {


        try {
            String name = GetTodoName.todoName(cmd);
            Boolean done = GetOptDone.getValue(cmd);

            return new Task(name, done);

        } catch (Exception e) {
            throw new IllegalArgumentException("Problème avec la création de la tache.");
        }
    }
}
