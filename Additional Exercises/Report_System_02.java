package Dopulnitelni_Zadachi___;

import java.util.Scanner;

public class Report_System_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int goal = Integer.parseInt(scanner.nextLine());

        int creditCards = 0;
        int cash = 0;
        double creditcardpayment = 0;
        double cashpayment = 0;
        int counter = 0;
        double totalmoney=0;

        String command = scanner.nextLine();

        while (!command.equals("End")) {

            int number = Integer.parseInt(command);
            counter++;

            if (counter % 2 == 0) {

                if (number > 10){

                    creditCards++;
                    creditcardpayment += number;
                    System.out.printf("Product sold!%n");
                } else {

                    System.out.printf("Error in transaction!%n");

                }
            } else {
                if (number <=100) {

                    cash++;
                    cashpayment += number;
                    System.out.printf("Product sold!%n");


                } else {

                    System.out.printf("Error in transaction!%n");

                }
            }
                totalmoney = creditcardpayment + cashpayment;

                if (totalmoney >= goal) {
                    break;
                }
                command = scanner.nextLine();
             }


        double avgcards = creditcardpayment/creditCards;
        double avgcash = cashpayment/cash;
            if (totalmoney>=goal) {
                System.out.printf("Average CS: %.2f%n",avgcash);
                System.out.printf("Average CC: %.2f",avgcards);
            } else {
                System.out.println("Failed to collect required money for charity.");

            }

    }
}

