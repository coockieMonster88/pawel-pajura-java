package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String DRIVINGTASK = "DRIVINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String SHOPPINGTASK = "SHOPPINGTASK";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case DRIVINGTASK:
                return new DrivingTask("Drive Task","Warsaw","Train");
            case PAINTINGTASK:
                return new PaintingTask("Paint Task","Green","Car");
            case SHOPPINGTASK:
                return new ShoppingTask("Shopping Task","Book",2.0);
            default:
                return null;
        }
    }

}
