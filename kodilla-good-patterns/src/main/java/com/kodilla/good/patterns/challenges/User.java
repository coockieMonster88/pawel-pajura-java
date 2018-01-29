package com.kodilla.good.patterns.challenges;

public class User implements MailService{
    private String userName;
    private String userLastName;
    private String userEmail;

    public User(String userName, String userLastName, String userEmail) {
        this.userName = userName;
        this.userLastName = userLastName;
        this.userEmail = userEmail;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (userName != null ? !userName.equals(user.userName) : user.userName != null) return false;
        if (userLastName != null ? !userLastName.equals(user.userLastName) : user.userLastName != null) return false;
        return userEmail != null ? userEmail.equals(user.userEmail) : user.userEmail == null;
    }

    @Override
    public int hashCode() {
        int result = userName != null ? userName.hashCode() : 0;
        result = 31 * result + (userLastName != null ? userLastName.hashCode() : 0);
        result = 31 * result + (userEmail != null ? userEmail.hashCode() : 0);
        return result;
    }

    @Override
    public String sendEmail() {
        return "Email send at e-mal " + getUserEmail().toString();
    }
}
