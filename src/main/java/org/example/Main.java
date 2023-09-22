package org.example;

public class Main {
    public static void main(String[] args) {
        Clothing jeans = new Clothing("Blue Jeans", 20.0, Size.M);
        Clothing tShirt = new Clothing("White T Shirt", 5.0, Size.S);
        Clothing buttonUp = new Clothing("Button Up Shirt", 30.0, Size.L);

        Clothing[] managerCart = new Clothing[]{jeans, tShirt, buttonUp};
        Manager manager1 = new Manager("Jim Jones", Size.S, managerCart);
        Clothing[] hourlyEmployeeCart = new Clothing[]{jeans, tShirt, buttonUp};
        HourlyEmployee hourlyEmployee1 = new HourlyEmployee("Tim Smith", Size.L, hourlyEmployeeCart);
        System.out.println(Shop.calculateTotal(managerCart));
        System.out.println("Jeans fit hourly employee: " + Shop.isAFit(hourlyEmployee1, jeans));
        hourlyEmployee1.printEmployeePriceAfterDiscount(tShirt);
        manager1.printEmployeePriceAfterDiscount(tShirt);
        Clothing[] studentCart = new Clothing[]{jeans, tShirt, buttonUp};
        Student student1 = new Student("John Alex", Size.M, studentCart);
        System.out.println(student1.calculateDiscount(tShirt));

        Customer.printCustomerName(manager1);
        Customer.printCustomerName(hourlyEmployee1);
        Customer.printCustomerName(student1);

        Clothing socks = new Clothing("White Socks", 5.0, Size.M);
        Clothing boxers = new Clothing("Black Boxers", 5.0, Size.S);
        Clothing vest = new Clothing("Brown Vest", 20.0, Size.L);

        Clothing[] clothingItems = new Clothing[]{socks, boxers, vest};
        Discountable[] discountables = new Discountable[]{manager1, hourlyEmployee1, student1};
        Shop.printDiscountAmountOff(discountables, buttonUp);
    }
}