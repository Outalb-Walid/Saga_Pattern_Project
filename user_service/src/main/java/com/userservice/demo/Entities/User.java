package com.userservice.demo.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.validation.constraints.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull(message = "Username label must be defined")
    private String username;
    
    @NotNull(message = "Email label must be defined")
    private String email;
    
    @NotNull(message = "Balance label must be defined")
    private double balance;

    
    public User() {
    }
    
    public User(Long id, String username, String email, double balance) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.balance = balance;
    }
    public User(String username, String email, double balance) {
        this.username = username;
        this.email = email;
        this.balance = balance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
