package Dopulnitelni_Zadachi___;

import java.util.Scanner;

public class Godzilla_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double budget = Double.parseDouble(scanner.nextLine());
        int statisti = Integer.parseInt(scanner.nextLine());
        double priceforuniform1statist = Double.parseDouble(scanner.nextLine());

            double decor = 0.0;
            double alluniforms = 0.0;
        double totalexpense = (decor + alluniforms);
        double totalSum = Math.abs(budget - totalexpense);

        if (statisti>150) {

          alluniforms =( 1.0 * statisti * priceforuniform1statist) * 0.90;
             decor = budget * 0.10;
            totalexpense = (decor + alluniforms);
            totalSum = Math.abs(budget - totalexpense);

        } else {
           decor = budget * 0.10;
            alluniforms = 1.0 * statisti * priceforuniform1statist;
            totalexpense = (decor + alluniforms);
            totalSum = Math.abs(budget - totalexpense);

        }

        if (budget>=totalexpense) {
            System.out.printf("Action!%n");
            System.out.printf("Wingard starts filming with %.2f leva left.", totalSum);
        } else {

            System.out.printf("Not enough money!%n");
            System.out.printf("Wingard starts filming with %.2f leva left.",totalSum);
        }
    }
}
