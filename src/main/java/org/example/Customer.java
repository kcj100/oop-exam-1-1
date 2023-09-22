package org.example;

public abstract class Customer extends Person {

    public Customer(String name) {
        super(name);
    }
    public Customer(String name, Size size, Clothing[] clothingItems) {
        super(name, size, clothingItems);
    }

    public static void printCustomerName(Customer customer) {
        System.out.println(customer.getName());
    }

    @Override
    public String toString() {
        return "Customer{}";
    }
}
