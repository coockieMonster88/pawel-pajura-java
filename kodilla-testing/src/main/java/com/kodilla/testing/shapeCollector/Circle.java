package com.kodilla.testing.shapeCollector;

public class Circle implements Shape {

    private String name;
    private Integer field;

    public Circle(String name, Integer field) {
        this.name = name;
        this.field = field;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    public Integer getField() {
        return field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (!name.equals(circle.name)) return false;
        return field.equals(circle.field);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + field.hashCode();
        return result;
    }

}
