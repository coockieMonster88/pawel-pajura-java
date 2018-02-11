package com.kodilla.good.patterns.challenges.flights;

public class Flight {
    private String cityTo;
    private String cityFrom;


    public Flight(String cityTo, String cityFrom) {
        this.cityTo = cityTo;
        this.cityFrom = cityFrom;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "cityTo='" + cityTo + '\'' +
                ", cityFrom='" + cityFrom + '\'' +
                '}';
    }

    public String getCityTo() {
        return cityTo;
    }

    public String getCityFrom() {
        return cityFrom;
    }
}
