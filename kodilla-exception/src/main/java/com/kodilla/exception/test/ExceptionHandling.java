package com.kodilla.exception.test;

public class ExceptionHandling {
    public String probablyIWillThrowException(double x, double y)  {
        if(x >= 2 || x < 1 || y == 1.5) {
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "Done!";
    }
}
