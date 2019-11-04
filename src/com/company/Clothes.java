package com.company;

abstract public class Clothes {
    protected String name;
    protected String fabricType;
    protected int size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFabricType() {
        return fabricType;
    }

    public void setFabricType(String fabricType) {
        this.fabricType = fabricType;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Clothes(String name, String fabricType, int size) {
        this.name = name;
        this.fabricType = fabricType;
        this.size = size;
    }


}
