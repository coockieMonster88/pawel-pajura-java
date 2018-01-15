package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {
    private String countryNane;
    private BigDecimal peopleQuantity;

    public Country(String countryName, BigDecimal peopleQuantity) {
        this.countryNane = countryName;
        this.peopleQuantity = peopleQuantity;
    }



    public BigDecimal getPeopleQuantity () {
        return peopleQuantity;
    }
}
