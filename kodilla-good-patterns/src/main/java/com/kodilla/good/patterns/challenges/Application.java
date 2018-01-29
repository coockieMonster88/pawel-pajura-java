package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class Application {
    public static void main(String[] args) {
        User user1 = new User("Paul", "Pajura", "pawel.pajura@gmail.com");

        LocalDateTime orderDate = LocalDateTime.of(2017, 10, 10, 13, 10);
        LocalDateTime orderShipped = LocalDateTime.of(2017,10,11,9,15);

        ProductOrderService productOrderService = new ProductOrderService();
        boolean isOrdered = productOrderService.order(ProductOrderService.BOOK,user1,orderDate,orderShipped);

        if (isOrdered) {
            System.out.println(user1.sendEmail());
        }


    }
}
