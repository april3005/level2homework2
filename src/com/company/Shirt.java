package com.company;

public class Shirt extends Clothes implements Printable {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Shirt(String name, String fabricType, int size, String color) {
        super(name, fabricType, size);
        this.color = color;
    }

    @Override
    public void print() {

    }
}
