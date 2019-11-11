package com.company;

public class Main {

    public static void main(String[] args) {
        Clothes clothes = createObject("Dress");
        System.out.println(clothes.getName());
    }

    public static Clothes createObject(String objectName) {
        switch (objectName) {
            case "Dress":
                return new Dress("Sample", "Silk", 4, "No pattern");
            case "Jeans":
                return new Jeans("Levis", "Cotton", 6, "Mom jeans");
            case "Shirt":
                return new Shirt("Madelene", "Silk", 4, "Yellow");
            default:
                return null;
        }
    }
}
