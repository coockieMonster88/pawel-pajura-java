package com.kodilla.good.patterns.challenges.flights;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlightRegister {
    private  String cityOfDeparture;
    private  String cityOfArrival;
    private  String cityInterChange;
    private LocalDateTime flightDate;
    private List<Flight> flightList = new ArrayList();

    public FlightRegister() {
        flightList.add(new Flight("Moscow", "Warsaw"));
        flightList.add(new Flight("Madrid", "Moscow"));
        flightList.add(new Flight("London", "Paris"));
        flightList.add(new Flight("Paris", "New York"));
    }

    public String getCityOfDeparture() {
        return cityOfDeparture;
    }

    public String getCityOfArrival() {
        return cityOfArrival;
    }

    public String getCityInterChange() {
        return cityInterChange;
    }

    public LocalDateTime getFlightDate() {
        return flightDate;
    }

    public void flightsToFromThrough(String from, String through, String to) {
        System.out.println('\n' + "List flights intermediate " + from + " to " + to
                + " by " + through);
        List<Flight> fromAToB = flightList.stream()
                .filter(f -> (f.getCityTo().equals(through) && f.getCityFrom().equals(from)))
                .collect(Collectors.toList());
        List<Flight> fromBToC = flightList.stream()
                .filter(f -> (f.getCityTo().equals(to) && f.getCityFrom().equals(through)))
                .collect(Collectors.toList());
        List<Flight> fromAThroughBToC = Stream.concat(fromAToB.stream(), fromBToC.stream())
                .collect(Collectors.toList());
        fromAThroughBToC.forEach(System.out::println);

    }
}
