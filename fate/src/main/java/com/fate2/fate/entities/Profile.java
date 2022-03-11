package com.fate2.fate.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Profile {
    
    @Id
    @Column(unique = true)
    private long userIdNumber;
    private String displayName;
    @Column(unique = true)
    private String username;
    private String dateOfBirthString;
    // private Date dateOfBirth;
    private String bio;
    

    public Profile(){}

    public Profile(long userIdNumber) {
        this.userIdNumber = userIdNumber;
    }

    public Profile(long userIdNumber,String displayName, String username, String dateOfBirthString){
        this.displayName = displayName;
        this.userIdNumber=userIdNumber;
        this.username = username;
        this.dateOfBirthString=dateOfBirthString;
    }

    public long getUserIdNumber() {
        return userIdNumber;
    }

    public void setUserIdNumber(long userIdNumber) {
        this.userIdNumber = userIdNumber;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDateOfBirthString() {
        return dateOfBirthString;
    }

    public void setDateOfBirthString(String dateOfBirthString) {
        this.dateOfBirthString = dateOfBirthString;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
    
    
}
