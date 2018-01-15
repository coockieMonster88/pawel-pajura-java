package com.kodilla.testing.forum.statistics;

public class ForumStats {
    private int commentsCount;
    private int usersCount;
    private int postsCount;
    private double postsPerUser;
    private double commentsPerUser;
    private double commentsPerPost;


    private Statistics statistics;
    public ForumStats(Statistics statistics) {
        this.statistics = statistics;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public int getUsersCount() {
        return usersCount;
    }

    public double getPostsPerUser() {
        return postsPerUser;
    }

    public double getCommentsPerUser() {
        return commentsPerUser;
    }

    public double getCommentsPerPost() {
        return commentsPerPost;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public void calculateAdvStatistics() {
        this.usersCount = statistics.usersNames().size();
        this.commentsCount=statistics.commentsCount();
        this.postsCount=statistics.postsCount();
        this.postsPerUser=this.postsCount/this.usersCount;
        this.commentsPerUser=this.commentsCount/this.usersCount;
        if(this.postsCount > 0) {
            this.commentsPerPost = this.commentsCount / this.postsCount;
        } else {
            this.commentsPerPost = 0;
        }
    }

}
