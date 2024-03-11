package com.fges.todoapp.data.web;

import java.util.List;

public interface CrudProvider<Domain> {
    void add(Domain domain) throws Exception;

    List<Domain> list() throws Exception;
}
