package com.kodilla.good.patterns.challenges.food2Door;

public class OrderDto {
    public Deliver deliver;
    public boolean isOrdered;

    public OrderDto(Deliver deliver, boolean isOrdered) {
        this.deliver = deliver;
        this.isOrdered = isOrdered;
    }

    public Deliver getDeliver() {
        return deliver;
    }

    public boolean isOrdered() { return isOrdered;}
}
