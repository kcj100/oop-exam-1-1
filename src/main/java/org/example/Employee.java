package org.example;

public abstract class Employee extends Customer implements Discountable {

    private final double DISCOUNT = .10;

    public Employee(String name) {
        super(name);
    }

    public Employee(String name, Size size, Clothing[] clothingItems) {
        super(name, size, clothingItems);
    }

    public abstract void printEmployeePriceAfterDiscount(Clothing clothing);


    public double getDISCOUNT() {
        return DISCOUNT;
    }
}
