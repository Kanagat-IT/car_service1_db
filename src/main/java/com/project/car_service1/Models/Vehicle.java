package com.project.car_service1.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity

public class Vehicle implements java.io.Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int vin;
    public String number;
    public String nick;
    public String brand;
    public String model;
    public int year_issue;
    public String category;

    public Vehicle() {
    }

    public Vehicle(int vin, String number, String nick, String brand, String model, int year_issue, String category) {
        this.vin = vin;
        this.number = number;
        this.nick = nick;
        this.brand = brand;
        this.model = model;
        this.year_issue = year_issue;
        this.category = category;
    }

    public Vehicle(String number, String brand, String model) {
        this.number = number;
        this.brand = brand;
        this.model = model;
    }

    public Vehicle(String number, String nick, String brand, String model, int year_issue, String category) {
        this.number = number;
        this.nick = nick;
        this.brand = brand;
        this.model = model;
        this.year_issue = year_issue;
        this.category = category;
    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear_issue() {
        return year_issue;
    }

    public void setYear_issue(int year_issue) {
        this.year_issue = year_issue;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}