package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";
    public static final String DRIVING = "DRIVING";

    public final Task createTask(String taskClass) {
        switch (taskClass) {
            case PAINTING:
                return new PaintingTask("Painting", "red", "Apple");
            case SHOPPING:
                return new ShoppingTask("Shopping", "Computer", 1);
            case DRIVING:
                return new DrivingTask("Driving", "Gdańsk", "car");
            default:
                return null;
        }
    }

}
