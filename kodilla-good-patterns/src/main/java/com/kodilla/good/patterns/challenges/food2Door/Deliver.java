package com.kodilla.good.patterns.challenges.food2Door;

public class Deliver {
    private String userName;
    private String userSurname;
    private String userEmail;
    private Integer productQuantity;
    private String productKind;

    public Deliver(String userName, String userSurname, String userEmail, Integer productQuantity, String productKind) {
        this.userName = userName;
        this.userSurname = userSurname;
        this.userEmail = userEmail;
        this.productQuantity = productQuantity;
        this.productKind = productKind;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public Integer getProductQuantity() { return  productQuantity; }

    public String getProductKind() { return  productKind; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Deliver deliver = (Deliver) o;

        if (userName != null ? !userName.equals(deliver.userName) : deliver.userName != null) return false;
        if (userSurname != null ? !userSurname.equals(deliver.userSurname) : deliver.userSurname != null) return false;
        return userEmail != null ? userEmail.equals(deliver.userEmail) : deliver.userEmail == null;
    }

    @Override
    public int hashCode() {
        int result = userName != null ? userName.hashCode() : 0;
        result = 31 * result + (userSurname != null ? userSurname.hashCode() : 0);
        result = 31 * result + (userEmail != null ? userEmail.hashCode() : 0);
        return result;
    }
}
