package com.kodilla.exception.test;

public class FirstChallenge {
    public class FirstChallenge {

        public double divide(double a, double b)  {

            try {
                double result = a/b;

            } catch (ArithmeticException e) {
                System.out.println("Invalid operation " + e);
            }
            return a/b;
        }

        /**
         * This main can throw an ArithmeticException!!!
         * @param args
         */
        public static void main(String[] args) {

            FirstChallenge firstChallenge = new FirstChallenge();

            double result = firstChallenge.divide(3, 0);

            System.out.println(result);

        }
}
