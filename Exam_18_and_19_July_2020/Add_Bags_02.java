package Exam_18_and_19_July_2020;

import java.util.Scanner;

public class Add_Bags_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double priceover20kg = Double.parseDouble(scanner.nextLine());
        double weightofLuggage = Double.parseDouble(scanner.nextLine());
        int daystoDeparture = Integer.parseInt(scanner.nextLine());
        int luggageAmount = Integer.parseInt(scanner.nextLine());


        double pricePerluggage=0.0;
        double totalprice=0.0;


        if (weightofLuggage<10){
            pricePerluggage=priceover20kg*0.2;
            totalprice=pricePerluggage * luggageAmount;
            if (daystoDeparture<7){
                pricePerluggage=pricePerluggage*1.4;
                totalprice=pricePerluggage * luggageAmount;

            } else if (daystoDeparture>=7 && daystoDeparture<=30) {
                pricePerluggage=pricePerluggage*1.15;
                totalprice=pricePerluggage * luggageAmount;

            }else {
                pricePerluggage=pricePerluggage*1.1;
                totalprice=pricePerluggage * luggageAmount;
            }

        } else if (weightofLuggage>=10 && weightofLuggage<=20) {
            pricePerluggage=priceover20kg/2;
            totalprice=pricePerluggage * luggageAmount;
            if (daystoDeparture<7){
                pricePerluggage=pricePerluggage*1.4;
                totalprice=pricePerluggage * luggageAmount;
            } else if (daystoDeparture>=7 && daystoDeparture<=30) {
                pricePerluggage=pricePerluggage*1.15;
                totalprice=pricePerluggage * luggageAmount;
            }else {
                pricePerluggage=pricePerluggage*1.1;
                totalprice=pricePerluggage * luggageAmount;
            }

        }else {
            pricePerluggage=priceover20kg;
            totalprice=pricePerluggage * luggageAmount;

            if (daystoDeparture<7){
                pricePerluggage=pricePerluggage*1.4;
                totalprice=pricePerluggage * luggageAmount;

            } else if (daystoDeparture>=7 && daystoDeparture<=30) {
                pricePerluggage=pricePerluggage*1.15;
                totalprice=pricePerluggage * luggageAmount;

            }else {
                pricePerluggage=pricePerluggage*1.1;
                totalprice=pricePerluggage * luggageAmount;
            }

        }
        System.out.printf("The total price of bags is: %.2f lv.",totalprice);


    }
}
