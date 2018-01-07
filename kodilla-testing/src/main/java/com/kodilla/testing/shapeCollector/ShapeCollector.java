package com.kodilla.testing.shapeCollector;

import java.util.ArrayList;

public class ShapeCollector implements Shape {

    private ArrayList<Shape> figures = new ArrayList<>();


    public void addFigure(Shape shape) {
        figures.add(shape);
        Circle circle = new Circle("tire", 5);
        Triangle triangle = new Triangle("Piramid", 7);
        Square square = new Square("Cube", 4);
        figures.add(circle);
        figures.add(triangle);
        figures.add(square);
    }

    public boolean removeFigure(Shape shape) {
        // return true temporarily
        boolean result = false;
        if (figures.contains(shape)) {
            figures.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n) {
        return  figures.get(n);
    }


    public void showFigures() {
        System.out.println(figures);
    }

    @Override
    public String getShapeName() {
        return null;
    }

    @Override
    public Integer getField() {
        return null;
    }
}