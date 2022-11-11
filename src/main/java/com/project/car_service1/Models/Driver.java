package com.project.car_service1.Models;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int owner_id;

    private String username;
    private String password;

    public Driver() {
    }

    public Driver(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Driver(int owner_id, String username, String password) {
        this.owner_id = owner_id;
        this.username = username;
        this.password = password;
    }

    public int getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(int owner_id) {
        this.owner_id = owner_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
