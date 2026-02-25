package com.example.SpringBootPracticeCodes.RESTAPIPractice;

import org.springframework.stereotype.Component;


public class Stock {
    private int id;
    private String  name;
    private String ticker;
    private double price;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTicker() {
        return ticker;
    }

    public double getPrice() {
        return price;
    }
}
