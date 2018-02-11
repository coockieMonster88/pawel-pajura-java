package com.kodilla.good.patterns.challenges.food2Door;

public class ProductOrderService {
    public static final String DELIVER = "DELIVER";
    public static final String CLIENT = "CLIENT";

    public boolean order(final String orderKind, final Deliver deliver, final Client client) {
        switch (orderKind) {
            case DELIVER:
                return processDeliver(deliver, client);
            case CLIENT:
                return processClient(client);
            default:
                System.out.println("Wrong process!");
        }
        return false;
    }
    private boolean processDeliver (final Deliver deliver, final Client client) {
        System.out.println("Food delivered by: " + deliver.getUserSurname() + " " + deliver.getUserName() + " " + deliver.getUserEmail()
        + "Product kind: " + client.getProductKind() + "Product quantity: " + client.getProductQuantity());
        return true;
    }

    private boolean processClient (final  Client client) {
        System.out.println("Food recived to: " + client.getClientSurname() + " " + client.getClientName() + " " + client.getClientEmail()
        + "Product kind " + client.getProductKind() + "Product quantity: " + client.getProductQuantity());
        return true;
    }

}
