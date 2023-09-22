package org.example;

public abstract class Person {
    private String name;
    private Size size;
    private Clothing[] clothingItems;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, Size size, Clothing[] clothingItems) {
        this.name = name;
        this.size = size;
        this.clothingItems = clothingItems;
    }

    public String getName() {
        return name;
    }

    public Size getSize() {
        return size;
    }

    public Clothing[] getClothingItems() {
        return clothingItems;
    }
}
