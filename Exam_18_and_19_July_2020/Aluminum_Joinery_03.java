package Exam_18_and_19_July_2020;

import java.util.Scanner;

public class Aluminum_Joinery_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int amount = Integer.parseInt(scanner.nextLine());
        String kind= scanner.nextLine();
        String deliveryOptions= scanner.nextLine();

        double price=0.0;

        if (amount<10){
            System.out.printf("Invalid order");

        }else {

            if (deliveryOptions.equals("With delivery")) {

                switch (kind) {
                    case "90X130":
                        price = amount * 110;
                        if (amount > 30 && amount <= 60) {
                            price = amount * 110 * 0.95;
                        } else if (amount > 60 && amount <= 99) {
                            price = amount * 110 * 0.92;
                        } else if (amount > 99) {
                            price = amount * 110 * 0.92 + 60;
                            price = price * 0.96;
                        }
                        System.out.printf("%.2f BGN",price );
                        break;

                    case "100X150":
                        price = amount * 140;
                        if (amount > 40 && amount <= 80) {
                            price = amount * 140 * 0.94;
                        } else if (amount > 80 && amount <= 99) {
                            price = amount * 140 * 0.90;
                        } else if (amount > 99) {
                            price = amount * 140 * 0.90 + 60;
                            price = price * 0.96;
                        }
                        System.out.printf("%.2f BGN",price );
                        break;

                    case "130X180":
                        price = amount * 190;
                        if (amount > 20 && amount <= 50) {
                            price = amount * 190 * 0.93;
                        } else if (amount > 50 && amount <= 99) {
                            price = amount * 190 * 0.88;
                        } else if (amount > 99) {
                            price = amount * 190 * 0.88 + 60;
                            price = price * 0.96;
                        }
                        System.out.printf("%.2f BGN",price );
                        break;

                    case "200X300":
                        price = amount * 250;
                        if (amount > 25 && amount <= 50) {
                            price = amount * 250 * 0.91;
                        } else if (amount > 50 && amount <= 99) {
                            price = amount * 250 * 0.86;
                        } else if (amount > 99) {
                            price = amount * 250 * 0.86 + 60;
                            price = price * 0.96;
                        }
                        System.out.printf("%.2f BGN",price );
                        break;


                }

            } else if (deliveryOptions.equals("Without delivery")) {
                switch (kind) {
                    case "90X130":
                        price = amount * 110;
                        if (amount > 30 && amount <= 60) {
                            price = amount * 110 * 0.95;
                        } else if (amount > 60 && amount<= 99) {
                            price = amount * 110 * 0.92;
                        } else if (amount > 99) {
                            price = amount * 110 * 0.92;
                            price = price * 0.96;
                        }
                        System.out.printf("%.2f BGN",price );
                        break;

                    case "100X150":
                        price = amount * 140;
                        if (amount > 40 && amount <= 80) {
                            price = amount * 140 * 0.94;
                        } else if (amount > 80 && amount <= 99) {
                            price = amount * 140 * 0.90;
                        } else if (amount > 99) {
                            price = amount * 140 * 0.90 ;
                            price = price * 0.96;
                        }
                        System.out.printf("%.2f BGN",price );
                        break;

                    case "130X180":
                        price = amount * 190;
                        if (amount > 20 && amount <= 50) {
                            price = amount * 190 * 0.93;
                        } else if (amount > 50 && amount <= 99) {
                            price = amount * 190 * 0.88;
                        } else if (amount > 99) {
                            price = amount * 190 * 0.88 ;
                            price = price * 0.96;
                        }
                        System.out.printf("%.2f BGN",price );
                        break;

                    case "200X300":
                        price = amount * 250;
                        if (amount > 25 && amount <= 50) {
                            price = amount * 250 * 0.91;
                        } else if (amount > 50 && amount <= 99) {
                            price = amount * 250 * 0.86;
                        } else if (amount > 99) {
                            price = amount * 250 * 0.86;
                            price = price * 0.96;
                        }
                        System.out.printf("%.2f BGN",price );
                        break;


                }


            }

        }


    }
}
