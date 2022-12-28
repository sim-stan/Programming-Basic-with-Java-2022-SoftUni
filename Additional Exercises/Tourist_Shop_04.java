package Dopulnitelni_Zadachi___;

import java.util.Scanner;

public class Tourist_Shop_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());

        String command = scanner.nextLine();
        double productSum = 0;
        int productCount = 0;

        while (!command.equals("Stop") ||budget<productSum) {

            String product = command;
            double priceProduct = Double.parseDouble(scanner.nextLine());
            productCount++;



            if (budget < priceProduct) {

                break;

            }
            if (productCount > 2) {
                productSum = productSum + (priceProduct / 2);

            }
            if (productCount < 3) {
                productSum = productSum + priceProduct;

            }


            command = scanner.nextLine();
        }

        double diff = Math.abs(budget - productSum);
        if (command.equals("Stop") || budget > productSum) {
            System.out.printf("You bought %d products for %.2f leva.", productCount, productSum);


        } else {
            System.out.printf("You don't have enough money!%nYou need %.2f leva!", diff);

        }
    }
}
