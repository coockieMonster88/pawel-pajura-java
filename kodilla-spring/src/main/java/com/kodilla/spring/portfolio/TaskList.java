package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList  {
    private List<String> tasks;
    private String name;

    public TaskList(String name) {
        this.tasks = new ArrayList<>();
        this.name = name;
    }

    public List<String> getTasks() {
        return tasks;
    }

    public String getName() {
        return name;
    }
}
