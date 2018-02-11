package com.kodilla.good.patterns.challenges.food2Door;

public class Apllicaction {

    public static void main(String[] args) {
        Deliver deliver = new Deliver("Jan", "Kowalski", "jan.kowalski@gmail.com", 100, "Beer");
        Client client = new Client("Pawel", "Pajura", "pawel.pajura@gmail.com", 10, "Beer");

        ProductOrderService productOrderService = new ProductOrderService();

        boolean isOrdered = productOrderService.order(ProductOrderService.CLIENT, deliver, client);

    }
}