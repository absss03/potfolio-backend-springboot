package com.portfolio.abi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
    
    @Id
    private String userId;
    
    private String password;

    public User() {
    }

    public User(String userId, String password) {
        this.userId = userId;
        this.password = password;
    }


    public String getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }
}
