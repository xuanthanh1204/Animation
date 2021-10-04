package com.baitaptransition;

import java.io.Serializable;

public class Tree implements Serializable {
    private String file, name;
    private double price;

    public Tree(String file, String name, double price) {
        this.file = file;
        this.name = name;
        this.price = price;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
