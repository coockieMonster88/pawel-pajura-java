package com.kodilla.good.patterns.challenges.food2Door;

public class Client  {

    private String clientName;
    private String clientSurname;
    private String clientEmail;

    public Client(String clientName, String clientSurname, String clientEmail) {
        this.clientName = clientName;
        this.clientSurname = clientSurname;
        this.clientEmail = clientEmail;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (!clientName.equals(client.clientName)) return false;
        if (!clientSurname.equals(client.clientSurname)) return false;
        return clientEmail.equals(client.clientEmail);
    }

    @Override
    public int hashCode() {
        int result = clientName.hashCode();
        result = 31 * result + clientSurname.hashCode();
        result = 31 * result + clientEmail.hashCode();
        return result;
    }

}
