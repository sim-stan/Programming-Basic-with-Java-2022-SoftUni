package Dopulnitelni_Zadachi___;

import java.util.Scanner;

public class Add_Bags_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceOver20kg = Double.parseDouble(scanner.nextLine());
        double weightOFluggage = Double.parseDouble(scanner.nextLine());
        int daystotrip = Integer.parseInt(scanner.nextLine());
        int luggageCount = Integer.parseInt(scanner.nextLine());

        double price = priceOver20kg / luggageCount;


        if (weightOFluggage < 10) {
            double price1 = priceOver20kg * 0.20;
            price = price1 / luggageCount;

            if (daystotrip > 30) {
                price = price * 1.10;
                price = price * luggageCount;
            } else if (daystotrip > 7 && daystotrip <= 30) {
                price = price * 1.15;
                price = price * luggageCount;
            } else if (daystotrip < 7) {
                price = price * 1.4;
                price = price * luggageCount;


            }
        } else if (weightOFluggage >= 10 && weightOFluggage <= 20) {
            double price2 = priceOver20kg * 0.50;
            price = price2 / luggageCount;
            price = price * luggageCount;

            if (daystotrip > 30) {
                price = price * 1.10;
                price = price * luggageCount;
            } else if (daystotrip > 7 && daystotrip <= 30) {
                price = price * 1.15;
                price = price * luggageCount;
            } else if (daystotrip < 7) {
                price = price * 1.4;
                price = price * luggageCount;
            }
        } else {
            if (daystotrip > 30) {
                price = price * 1.10;
                price = price * luggageCount;
            } else if (daystotrip > 7 && daystotrip <= 30) {
                price = price * 1.15;
                price = price * luggageCount;
            } else if (daystotrip < 7) {
                price = price * 1.4;
                price = price * luggageCount;

            }

        }
        System.out.printf("The total price of bags is: %.2f lv.", price);
    }

}