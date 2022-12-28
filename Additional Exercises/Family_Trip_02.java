package Dopulnitelni_Zadachi___;

import java.util.Scanner;

public class Family_Trip_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int nightsCount = Integer.parseInt(scanner.nextLine());
        double priceperNIght = Double.parseDouble(scanner.nextLine());
        int percentAdditionalExpence = Integer.parseInt(scanner.nextLine());


        double discount = 0.0;
        double totalnights = 0.0;

        double additionalexpence = 0.0;

        if (nightsCount>7) {

            discount = (nightsCount * 0.95);
            totalnights = discount * priceperNIght;
            additionalexpence = budget * (1.00*percentAdditionalExpence/100);


        } else {
            totalnights = nightsCount * priceperNIght;
            additionalexpence = budget * (1.00*percentAdditionalExpence/100);
        }

        double totalSum = totalnights + additionalexpence;
        double diff = Math.abs(budget - totalSum);

            if (budget>totalSum) {


                System.out.printf("Ivanovi will be left with %.2f leva after vacation.",diff);
            } else {

                System.out.printf("%.2f leva needed.",diff);
            }
    }
}
