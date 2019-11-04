package com.company;

public class Jeans extends Clothes implements Printable {
    private String fit;

    public String getFit() {
        return fit;
    }

    public void setFit(String fit) {
        this.fit = fit;
    }

    public Jeans (String name, String fabricType, int size, String fit) {
        super(name, fabricType, size);
        this.fit = fit;
    }

    @Override
    public void print() {

    }
}
