package org.example;

public class Manager extends Employee{
    public Manager(String name) {
        super(name);
    }

    public Manager(String name, Size size, Clothing[] clothingItems) {
        super(name, size, clothingItems);
    }

    @Override
    public void printEmployeePriceAfterDiscount(Clothing clothing) {
        System.out.println(calculateDiscount(clothing));
    }

    @Override
    public double calculateDiscount(Clothing clothing) {
        return clothing.getPrice() - (clothing.getPrice() * getDISCOUNT() + .05);
    }
}
