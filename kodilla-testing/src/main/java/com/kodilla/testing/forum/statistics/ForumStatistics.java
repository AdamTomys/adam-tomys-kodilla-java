package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    private double userQuantity;
    private double postQuantity;
    private double commentsQuantity;
    private double averagePostPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        setUserQuantity(statistics.usersNames().size());
        setPostQuantity(statistics.postsCount());
        setCommentsQuantity(statistics.commentsCount());
        System.out.println("Calculating average of posts per one user ...");
        if (userQuantity != 0 && postQuantity != 0) {
            setAveragePostPerUser(postQuantity / userQuantity);
        }
        System.out.println("Calculating average of comments per one user ...");
        if (userQuantity != 0 && commentsQuantity != 0) {
            setAverageCommentsPerUser(commentsQuantity / userQuantity);
        }
        System.out.println("Calculating average of comments per one post ...");
        if (postQuantity != 0 && commentsQuantity != 0) {
            setAverageCommentsPerPost(commentsQuantity / postQuantity);
        }
    }

    public void showStatistics() {
        System.out.println("User quantity: " + (int) userQuantity);
        System.out.println("Post quantity: " + (int) postQuantity);
        System.out.println("Comments quantity: " + (int) commentsQuantity);
        System.out.println("Average of posts per one user: " + averagePostPerUser);
        System.out.println("Average of comments per one user: " + averageCommentsPerUser);
        System.out.println("Average of comments per one post: " + averageCommentsPerPost + "\n");
    }

    public double getUserQuantity() {
        return userQuantity;
    }

    public void setUserQuantity(int userQuantity) {
        this.userQuantity = userQuantity;
    }

    public double getPostQuantity() {
        return postQuantity;
    }

    public void setPostQuantity(int postQuantity) {
        this.postQuantity = postQuantity;
    }

    public double getCommentsQuantity() {
        return commentsQuantity;
    }

    public void setCommentsQuantity(int commentsQuantity) {
        this.commentsQuantity = commentsQuantity;
    }

    public double getAveragePostPerUser() {
        return averagePostPerUser;
    }

    public void setAveragePostPerUser(double averagePostPerUser) {
        this.averagePostPerUser = averagePostPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public void setAverageCommentsPerUser(double averageCommentsPerUser) {
        this.averageCommentsPerUser = averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

    public void setAverageCommentsPerPost(double averageCommentsPerPost) {
        this.averageCommentsPerPost = averageCommentsPerPost;
    }

}
