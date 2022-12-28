package ConditionalStatementsMOREexercises;

import java.util.Scanner;

public class train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fuelT = scanner.nextLine();
        double amountFuel = Double.parseDouble(scanner.nextLine());
        String card = scanner.nextLine();

        //•	Бензин – 2.22 лева за един литър,
        //•	Дизел – 2.33 лева за един литър
        //•	Газ – 0.93 лева за литър
        double priceGas = amountFuel * 0.93;
        double priceGasoline = amountFuel * 2.22;
        double priceDiesel = amountFuel * 2.33;
        double price = 0.0;
        if (fuelT.equals("Gasoline")) {

            if (card.equals("Yes")) {
                price = priceGasoline * 0.82;

                if (card.equals("No")) {
                    price = priceGasoline;
                    if (amountFuel > 19 && amountFuel <= 25) {
                        price = priceGasoline * 0.92;

                        if (amountFuel > 25) {
                            price = priceGasoline * 0.90;
                        }
                    }
                }
            }
        } else if (fuelT.equals("Diesel")) {


            if (card.equals("Yes")) {
                price = priceDiesel * 0.88;

                if (card.equals("No")) {
                    price = priceDiesel;

                    if (amountFuel > 19 && amountFuel <= 25) {
                        price = priceDiesel * 0.92;

                    } else if (amountFuel > 25) {
                        price = priceDiesel * 0.90;


                    }
                }
            }
        } else if (fuelT.equals("Gas")) {

            if (card.equals("Yes")) {
                price = priceGas * 0.92;

                if (card.equals("No")) {
                    price = priceGas;
                    if (amountFuel > 19 && amountFuel <= 25) {
                        price = priceGas * 0.92;
                    } else if (amountFuel > 25) {
                        price = priceGas * 0.90;

                    }
                }
            }
        }
        System.out.printf("%.2f lv.", price);
    }
}