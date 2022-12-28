package ConditionalStatementsMOREexercises;

import java.util.Scanner;

public class Fuel_trining {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuelT = scanner.nextLine();
        double amountFuel = Double.parseDouble(scanner.nextLine());
        String card = scanner.nextLine();

        //•	Бензин – 2.22 лева за един литър, - с карта 2.06
        //•	Дизел – 2.33 лева за един литър              2.21
        //•	Газ – 0.93 лева за литър                     0.85
        double priceGas = amountFuel * 0.93;
        double priceGasoline = amountFuel * 2.22;
        double priceDiesel = amountFuel * 2.33;
        double price = 0.0;

        if (fuelT.equals("Gasoline") && amountFuel<20) {
            switch (card) {
                case "Yes":
                    price = amountFuel * 2.06;
                    if (amountFuel > 19 && amountFuel <= 25) {
                        price = (amountFuel * 2.06) * 0.92;
                    } else if (amountFuel > 25)
                        price = amountFuel * 2.06 * 0.90;

                        System.out.printf("%.2f lv.", price);
                        break;

                case "No":
                    price = amountFuel * 2.22;
                    if (amountFuel > 19 && amountFuel <= 25) {
                        price = (amountFuel * 2.22) * 0.92;
                    } else if (amountFuel > 25) {
                        price = (amountFuel * 2.22) * 0.90;

                        System.out.printf("%.2f lv.", price);
                        break;
                    }
            }
        } else if (fuelT.equals("Gas")) {
            switch (card) {
                case "Yes":
                    price = amountFuel * 0.85;
                    if (amountFuel > 19 && amountFuel <= 25) {
                        price = (amountFuel * 0.085) * 0.92;
                    } else if (amountFuel > 25) {
                        price = (amountFuel * 0.85) * 0.90;

                        System.out.printf("%.2f lv.", price);
                        break;
                    }
                case "No":
                    price = amountFuel * 0.93;
                    if (amountFuel > 19 && amountFuel <= 25) {
                        price = (amountFuel * 0.93) * 0.92;
                    } else if (amountFuel > 25) {
                        price = (amountFuel * 0.93) * 0.90;

                        System.out.printf("%.2f lv.", price);
                        break;
                    }

            }
        } else if (fuelT.equals("Diesel")) {
            switch (card) {
                case "Yes":
                    price = amountFuel * 2.21;
                    if (amountFuel > 19 && amountFuel <= 25) {
                        price = (amountFuel * 2.21) * 0.92;
                    } else if (amountFuel > 25) {
                        price = (amountFuel * 2.21) * 0.90;

                        System.out.printf("%.2f lv.", price);
                        break;
                    }
                     case "No":
                    price = amountFuel * 2.33;
                    if (amountFuel > 19 && amountFuel <= 25) {
                        price = (amountFuel * 2.33) * 0.92;
                    } else if (amountFuel > 25) {
                        price = (amountFuel * 2.33) * 0.90;

                        System.out.printf("%.2f lv.", price);
                        break;
                    }

            }
        }
    }
}