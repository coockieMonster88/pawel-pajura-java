package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int idUser;
    private String userName;
    private char userSex;
    private LocalDate dateOfBirthUser;
    private int postsQuantity;

    public ForumUser (final int idUser, String userName, char userSex, LocalDate dateOfBirthUser, int postsQuantity ) {
        this.idUser=idUser;
        this.userName=userName;
        this.userSex=userSex;
        this.dateOfBirthUser=dateOfBirthUser;
        this.postsQuantity=postsQuantity;
    }
    public int getIdUser() {
        return idUser;
    }

    public String getUserName() {
        return userName;
    }

    public char getUserSex() {
        return userSex;
    }

    public LocalDate getDateOfBirthUser() {
        return dateOfBirthUser;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    @Override
    public String toString() {
        return "User{" +
                "User name='" + userName + '\'' +
                ", User Sex='" + userSex + '\'' +
                ", User date of birth=" + dateOfBirthUser +
                ", User post quantity='" + postsQuantity + '\'' +
                '}';
    }
}
