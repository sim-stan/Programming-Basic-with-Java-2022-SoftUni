package Nested_Loops_Lab;

import java.util.Scanner;

public class Travelling_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();


        while (!destination.equals("End")) {

            double moneyNeedit = Double.parseDouble(scanner.nextLine());

            double availableMoney=0;

            while (availableMoney<moneyNeedit) {

                double savings=Double.parseDouble(scanner.nextLine());

                availableMoney+=savings;


            }
            System.out.printf("Going to %s!%n",destination);


            destination= scanner.nextLine();
        }

    }
}
