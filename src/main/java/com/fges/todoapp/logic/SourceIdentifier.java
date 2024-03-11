package com.fges.todoapp.logic;


    public class SourceIdentifier {

        // the function of this class is to identiy the source that need to be used with the command
        public String identifySource(String input) {
            if (input.endsWith(".csv") || input.endsWith(".json")) {
                return "File";
            }
            else {
                throw new UnsupportedOperationException("The source type is not recognized.");
            }
    }
}