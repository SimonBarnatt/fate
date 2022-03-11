package com.fate2.fate.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class User {

    @Column(unique=true)
    private String email;
    private String password;
    private Boolean termsAndConditionsAccepted;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userIdNumber;

    public User() {
    }

    public User(String email, String password, Boolean termsAndConditionsAccepted) {
        this.email = email;
        this.password = password;
        this.termsAndConditionsAccepted = termsAndConditionsAccepted;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getTermsAndConditionsAccepted() {
        return termsAndConditionsAccepted;
    }

    public void setTermsAndConditionsAccepted(Boolean termsAndConditionsAccepted) {
        this.termsAndConditionsAccepted = termsAndConditionsAccepted;
    }

    public long getUserIdNumber() {
        return userIdNumber;
    }

    public void setUserIdNumber(long userIdNumber) {
        this.userIdNumber = userIdNumber;
    }

    
    
    
}
