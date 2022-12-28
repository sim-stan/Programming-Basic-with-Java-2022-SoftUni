package ConditionalStatementsMOREexercises;

import java.util.Scanner;

public class fuel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fuelT = scanner.nextLine();
        double amountFuel = Double.parseDouble(scanner.nextLine());
        String card = scanner.nextLine();

        //•	Бензин – 2.22 лева за един литър, - с карта 2.06
        //•	Дизел – 2.33 лева за един литър              2.21
        //•	Газ – 0.93 лева за литър                     0.85
        double priceGas = 0.0;
        double priceGasoline = 0.0;
        double priceDiesel = 0.0;
        double price = 0.0;

        if (fuelT.equals("Gasoline") && amountFuel <= 19) {
            switch (card) {
                case "Yes":
                    price = amountFuel * 2.06;
                    System.out.printf("%.2f lv.", price);
                    break;

                case "No":
                    price = amountFuel * 2.22;


                    System.out.printf("%.2f lv.", price);
                    break;
            }
        } else if (fuelT.equals("Gasoline") && amountFuel > 19 && amountFuel <= 25) {
            switch (card) {
                case "Yes":
                    price = (amountFuel * 2.06) * 0.92;

                    System.out.printf("%.2f lv.", price);
                    break;

                case "No":
                    price = (amountFuel * 2.22) * 0.92;

                    System.out.printf("%.2f lv.", price);
                    break;
            }
        } else if (fuelT.equals("Gasoline") && amountFuel > 25) {
            switch (card) {
                case "Yes":
                    price = amountFuel * 2.06 * 0.90;

                    System.out.printf("%.2f lv.", price);
                    break;

                case "No":
                    price = (amountFuel * 2.22) * 0.90;
                    System.out.printf("%.2f lv.", price);
                    break;
            }
        } else if (fuelT.equals("Gas") && amountFuel <= 19) {
            switch (card) {
                case "Yes":
                    price = amountFuel * 0.85;
                    System.out.printf("%.2f lv.", price);
                    break;

                case "No":
                    price = amountFuel * 0.93;


                    System.out.printf("%.2f lv.", price);
                    break;
            }
        } else if (fuelT.equals("Gas") && amountFuel > 19 && amountFuel <= 25) {
            switch (card) {
                case "Yes":
                    price = (amountFuel * 0.085) * 0.92;

                    System.out.printf("%.2f lv.", price);
                    break;

                case "No":
                    price = (amountFuel * 0.93) * 0.92;

                    System.out.printf("%.2f lv.", price);
                    break;
            }
        } else if (fuelT.equals("Gas") && amountFuel > 25) {
            switch (card) {
                case "Yes":
                    price = (amountFuel * 0.85) * 0.90;

                    System.out.printf("%.2f lv.", price);
                    break;

                case "No":
                    price = (amountFuel * 0.93) * 0.90;
                    System.out.printf("%.2f lv.", price);
                    break;
            }
        }
        if (fuelT.equals("Diesel") && amountFuel <= 19) {
            switch (card) {
                case "Yes":
                    price = amountFuel * 2.21;
                    System.out.printf("%.2f lv.", price);
                    break;

                case "No":
                    price = amountFuel * 2.33;


                    System.out.printf("%.2f lv.", price);
                    break;
            }
        } else if (fuelT.equals("Diesel") && amountFuel > 19 && amountFuel <= 25) {
            switch (card) {
                case "Yes":
                    price = (amountFuel * 2.21) * 0.92;

                    System.out.printf("%.2f lv.", price);
                    break;

                case "No":
                    price = (amountFuel * 2.33) * 0.92;

                    System.out.printf("%.2f lv.", price);
                    break;
            }
        } else if (fuelT.equals("Diesel") && amountFuel > 25) {
            switch (card) {
                case "Yes":
                    price = (amountFuel * 2.21) * 0.90;

                    System.out.printf("%.2f lv.", price);
                    break;

                case "No":
                    price = (amountFuel * 2.33) * 0.90;
                    System.out.printf("%.2f lv.", price);
                    break;
            }
        }
    }
}