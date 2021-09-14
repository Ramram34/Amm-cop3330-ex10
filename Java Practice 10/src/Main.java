
/*
 *  UCF COP3330 Fall 2021 Assignment 10 Solution
 *  Copyright 2021 Rami Amm
 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double item1;
        double item2;
        double item3;
        double quantity1;
        double quantity2;
        double quantity3;
        double subtotal;
        double ixq1;
        double ixq2;
        double ixq3;
        double tax;
        double total;

        System.out.println("Enter the price of item 1:");
        item1 = in.nextDouble();

        System.out.println("Enter the quantity of item 1:");
        quantity1 = in.nextDouble();

        System.out.println("Enter the price of item 2:");
        item2 = in.nextDouble();

        System.out.println("Enter the quantity of item 2:");
        quantity2 = in.nextDouble();

        System.out.println("Enter the price of item 3:");
        item3 = in.nextDouble();

        System.out.println("Enter the quantity of item 3:");
        quantity3 = in.nextDouble();

        ixq1 = item1 * quantity1;
        ixq2 = item2 * quantity2;
        ixq3 = item3 * quantity3;

        subtotal = ixq1 + ixq2 + ixq3;

        tax = subtotal * 0.055;

        total = subtotal + tax;

        System.out.println("Subtotal: $" + subtotal + "\r\n" +
                            "Tax: $" + tax + "\r\n" +
                            "Total: $" + total);
    }
}
