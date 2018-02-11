package com.kodilla.good.patterns.challenges.food2Door;

public class Client  {

    private String clientName;
    private String clientSurname;
    private String clientEmail;
    private Integer productQuantity;
    private String productKind;

    public Client(String clientName, String clientSurname, String clientEmail, Integer productQuantity, String productKind) {
        this.clientName = clientName;
        this.clientSurname = clientSurname;
        this.clientEmail = clientEmail;
        this.productQuantity = productQuantity;
        this.productKind = productKind;
    }

    public String getClientName() {
        return clientName;
    }

    public String getClientSurname() {
        return clientSurname;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public Integer getProductQuantity(){ return  productQuantity; }

    public  String getProductKind() { return  productKind; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (!clientName.equals(client.clientName)) return false;
        if (!clientSurname.equals(client.clientSurname)) return false;
        if (!clientEmail.equals(client.clientEmail)) return false;
        return productQuantity.equals(client.productQuantity);
    }

    @Override
    public int hashCode() {
        int result = clientName.hashCode();
        result = 31 * result + clientSurname.hashCode();
        result = 31 * result + clientEmail.hashCode();
        result = 31 * result + productQuantity.hashCode();
        return result;
    }
}
