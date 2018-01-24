package com.kodilla.exception.test;

public class FlightRunner {
    public static void main(String[] args) {
        Flight flight = new Flight("Warsaw", "Madrid");
        FlightProcessor flightProcessor = new FlightProcessor();
        try {
            System.out.println(flightProcessor.findFlight(flight));
        } catch (RouteNotFoundException e) {
            e.printStackTrace();
        }

    }
}
