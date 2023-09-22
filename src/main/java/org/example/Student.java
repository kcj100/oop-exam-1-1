package org.example;

public class Student extends Customer implements Discountable {

    private long studentID;
    private final double DISCOUNT = 0.5;

    public Student(String name, Size size, Clothing[] clothingItems) {
        super(name, size, clothingItems);
    }

    public Student(String name) {
        super(name);
    }

    @Override
    public double calculateDiscount(Clothing clothing) {
        return clothing.getPrice() - (clothing.getPrice() * DISCOUNT);
    }
}
