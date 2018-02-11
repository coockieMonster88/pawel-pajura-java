package com.kodilla.spring.portfolio;

public class Board {
    public TaskList toDolist;
    public TaskList inProgressList;
    public TaskList doneList;

    public Board(TaskList toDolist, TaskList inProgressList, TaskList doneList) {
        this.toDolist = toDolist;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public TaskList getToDolist() {
        return toDolist;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }
}
