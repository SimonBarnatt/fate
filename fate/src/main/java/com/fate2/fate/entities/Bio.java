package com.fate2.fate.entities;

public class Bio {
    private String bio;
    private long userId;

    public Bio(){}

    public Bio(long userId)
    {
        this.userId=userId;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }
    
    
}
