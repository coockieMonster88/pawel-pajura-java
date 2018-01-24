package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlightProcessor {

    private Map <String, Boolean> airports = new HashMap<>();

    public FlightProcessor() {
        airports.put("Warsaw", true);
        airports.put("Paris", true);
        airports.put("Berlin", false);
        airports.put("Moscow", true);
        airports.put("Madrid", false);
    }

    public boolean findFlight (Flight flight) throws RouteNotFoundException {
        List<Boolean> result = airports.entrySet().stream()
                .filter(e -> e.getKey().equals(flight.getArrivalAirport()))
                .map(e -> e.getValue())
                .collect(Collectors.toList());
        if (result.size() == 1) {
            return result.get(0);
        } else {
            throw new RouteNotFoundException();
        }
    }
}
