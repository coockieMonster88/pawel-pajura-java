package com.kodilla.patterns.strategy.social;

public class User {
    final private String name;
    protected SocialPublisher socialPublisher;


    public String getName() {
        return name;
    }

    public User(String name) {
        this.name = name;
    }

    public String sharePost() {
        return socialPublisher.share();
    }

    public void setSocialPortal (SocialPublisher socialPublisher) {
        this.socialPublisher=socialPublisher;
    }

}
