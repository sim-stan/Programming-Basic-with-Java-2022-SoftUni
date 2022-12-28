package Dopulnitelni_Zadachi___;

import java.util.Scanner;

public class Coffee_Machine_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String drink = scanner.nextLine();
        String sugar = scanner.nextLine();
        int drinksCount = Integer.parseInt(scanner.nextLine());

        double espresso = 0.0;
        double cappuccino = 0.0;
        double tea = 0.0;
         double price = 0.0;

        switch (drink) {

            case "Espresso":

                if (sugar.equals("Without")) {
                    price = (drinksCount * 0.90) * 0.65;

                } else if (sugar.equals("Normal")) {
                    price = drinksCount * 1.0;

                }else {
                    price = drinksCount * 1.2;
                }

                if (drinksCount>=5) {

                    price = price * 0.75;


                    break;

                }
            case "Cappuccino":
                if (sugar.equals("Without")) {
                    price = (drinksCount * 1.00) * 0.65 ;

                } else if (sugar.equals("Normal")) {
                    price = drinksCount * 1.2;

                }else {
                    price = drinksCount * 1.6;

                }

                break;

            case "Tea":
                if (sugar.equals("Without")) {
                    price = (drinksCount * 0.50) * 0.65 ;

                } else if (sugar.equals("Normal")) {
                    price = drinksCount * 0.6;

                }else {
                    price = drinksCount * 0.7;
                }

                    break;





        }
            if (price>15) {

                price = price *0.80;


            } else if (price>15) {

                price = price * 0.80;

            } else if (price>15.0) {
                price = price * 0.80;
            }
        System.out.printf("You bought %d cups of %s for %.2f lv.",drinksCount,drink,price);
    }
}
