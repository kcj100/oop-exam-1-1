package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Shop {
    public static double calculateTotal(Clothing[] clothingItems) {
        return Arrays.stream(clothingItems)
                .mapToDouble(Clothing::getPrice)
                .sum();
    }

    public static boolean isAFit(Customer customer, Clothing clothing) {
        return customer.getSize() == clothing.getSize();
    }

    public static void printDiscountAmountOff(Discountable[] discountables, Clothing clothing) {
        Arrays.stream(discountables)
                .forEach(i -> System.out.println(i.calculateDiscount(clothing)));
    }

    public static void sortAndPrintClothingItemsByPrice(ArrayList<Clothing> clothingList) {
        // Sort the clothingList by price in ascending order
        clothingList.stream()
                .sorted(Comparator.comparingDouble(Clothing::getPrice))
                .forEach(System.out::println);
    }

}
