package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductOrderService {
    public static final String GAME="GAME";
    public static final String BOOK="BOOK";
    public static final String MOVIE="MOVIE";

    public boolean order (final String orderKind, final User user, final LocalDateTime orderDate, final LocalDateTime orderShipped) {
        switch (orderKind) {
            case GAME:
                return orderGame(user,orderDate,orderShipped);
            case BOOK:
                return orderBook(user, orderDate, orderShipped);
            case MOVIE:
                return orderMovies(user,orderDate,orderShipped);
            default:
                System.out.println("Wrong order kind!");
                return false;
        }
    }

    private boolean orderGame (final User user, final LocalDateTime orderDate, final LocalDateTime orderShipped) {
        System.out.println("Game ordered by: " + user.getUserName() + " " + user.getUserLastName() + " @ day: " +orderDate.toString() + " and shipped to deliver at day: "
                + orderShipped.toString());
        return true;
    }

    private boolean orderBook (final  User user, final LocalDateTime orderDate, final LocalDateTime orderShipped) {
        System.out.println("Book ordered by: " + user.getUserName() + " " + user.getUserLastName() + "@day " + orderDate.toString()
         + " and sipped to deliver @ day: " + orderShipped.toString());
        return true;
    }
    private boolean orderMovies (final User user, final LocalDateTime orderDate, final LocalDateTime orderSipped) {
        System.out.println("Movie ordered by: " + user.getUserName() + " " + user.getUserLastName() + "@day " + orderDate.toString()
        + " and shipped to deliver @ day: " + orderSipped.toString());
        return true;
    }

}
