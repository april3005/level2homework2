package com.company;

public class Dress extends Clothes implements Printable{
    private String pattern;


    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public Dress(String name, String fabricType, int size, String pattern) {
        super(name, fabricType, size);
        this.pattern = pattern;
    }

    @Override
    public void print() {

    }
}
