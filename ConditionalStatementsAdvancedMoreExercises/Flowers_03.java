package ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class Flowers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amountH = Integer.parseInt(scanner.nextLine());
        int amountR = Integer.parseInt(scanner.nextLine());
        int amountL = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String yesOrno = scanner.nextLine();

        double priceH = 0.0;
        double priceR = 0.0;
        double priceL = 0.0;
        double total = priceH + priceR + priceL;
        double totalCount = amountH + amountR + amountL;

        if (yesOrno.equals("Y") && totalCount > 20) {
            switch (season) {

                case "Spring":
                    priceH = amountH * 2;
                    priceR = amountR * 4.1;
                    priceL = amountL * 2.5;
                    if (amountL > 7) {
                        total = (priceH + priceR + priceL) * 1.15 * 0.80 * 0.95;
                    } else
                        total = (priceH + priceR + priceL) * 1.15 * 0.80;
                    total = total + 2;
                    System.out.printf("%.2f", total);
                    break;
                case "Summer":
                    priceH = amountH * 2;
                    priceR = amountR * 4.1;
                    priceL = amountL * 2.5;

                    total = (priceH + priceR + priceL) * 1.15 * 0.80;
                    total = total + 2;
                    System.out.printf("%.2f", total);
                    break;
            }


        } else if (yesOrno.equals("Y") && totalCount < 20) {
            switch (season) {
                case "Spring":
                    priceH = amountH * 2;
                    priceR = amountR * 4.1;
                    priceL = amountL * 2.5;
                    if (amountL > 7) {
                        total = (priceH + priceR + priceL) * 1.15 * 0.95;
                    } else
                        total = (priceH + priceR + priceL) * 1.15;
                    total = total + 2;
                    System.out.printf("%.2f", total);
                    break;
                case "Summer":
                    priceH = amountH * 2;
                    priceR = amountR * 4.1;
                    priceL = amountL * 2.5;

                    total = (priceH + priceR + priceL) * 1.15;
                    total = total + 2;
                    System.out.printf("%.2f", total);
                    break;
            }
        }
        if (yesOrno.equals("N") && totalCount > 20) {
            switch (season) {

                case "Spring":
                    priceH = amountH * 2;
                    priceR = amountR * 4.1;
                    priceL = amountL * 2.5;

                    if (amountL > 7) {
                        total = (priceH + priceR + priceL) * 0.80 * 0.95;
                    } else
                        total = (priceH + priceR + priceL) * 0.80;
                    total = total + 2;
                    System.out.printf("%.2f", total);
                    break;
                case "Summer":
                    priceH = amountH * 2;
                    priceR = amountR * 4.1;
                    priceL = amountL * 2.5;

                    total = (priceH + priceR + priceL) * 0.80;
                    total = total + 2;
                    System.out.printf("%.2f", total);
                    break;
            }


        } else if (yesOrno.equals("N") && totalCount < 20) {
            switch (season) {
                case "Spring":

                    priceH = amountH * 2;
                    priceR = amountR * 4.1;
                    priceL = amountL * 2.5;
                    if (amountL > 7) {
                        total = (priceH + priceR + priceL) * 1.15 * 0.95;
                    } else
                        total = (priceH + priceR + priceL);
                    total = total + 2;
                    System.out.printf("%.2f", total);
                    break;
                case "Summer":

                    priceH = amountH * 2;
                    priceR = amountR * 4.1;
                    priceL = amountL * 2.5;

                    total = (priceH + priceR + priceL);
                    total = total + 2;
                    System.out.printf("%.2f", total);
                    break;
            }
        }
        if (yesOrno.equals("Y") && totalCount > 20) {
            switch (season) {

                case "Winter":
                    priceH = amountH * 3.75;
                    priceR = amountR * 4.5;
                    priceL = amountL * 4.15;
                    if (amountR >= 10 ) {

                        total = total * 0.90 * 1.15 * 0.80;

                    } else
                        total = (priceH + priceR + priceL) * 1.15 * 0.80;
                    total = total + 2;
                    System.out.printf("%.2f", total);
                    break;
                case "Autumn":
                    priceH = amountH * 3.75;
                    priceR = amountR * 4.5;
                    priceL = amountL * 4.15;

                    total = (priceH + priceR + priceL) * 1.15 * 0.80;
                    total = total + 2;
                    System.out.printf("%.2f", total);
                    break;
            }


        } else if (yesOrno.equals("Y") && totalCount < 20) {
            switch (season) {
                case "Winter":
                    priceH = amountH * 3.75;
                    priceR = amountR * 4.5;
                    priceL = amountL * 4.15;

                    if (amountR >= 10 ) {

                        total = (priceH + priceR + priceL) * 0.90 * 1.15;
                    } else
                        total = (priceH + priceR + priceL) * 1.15;
                    total = total + 2;
                    System.out.printf("%.2f", total);
                    break;
                case "Autumn":
                    priceH = amountH * 3.75;
                    priceR = amountR * 4.5;
                    priceL = amountL * 4.15;

                    total = (priceH + priceR + priceL) * 1.15;
                    total = total + 2;
                    System.out.printf("%.2f", total);
                    break;
            }
        }
        if (yesOrno.equals("N") && totalCount > 20) {
            switch (season) {

                case "Winter":
                    priceH = amountH * 3.75;
                    priceR = amountR * 4.5;
                    priceL = amountL * 4.15;

                    if (amountR >= 10 ) {

                        total = (priceH + priceR + priceL)  * 0.90 * 0.80 ;
                    } else
                        total = (priceH + priceR + priceL) * 0.80;
                    total = total + 2;
                    System.out.printf("%.2f", total);
                    break;
                case "Autumn":
                    priceH = amountH * 3.75;
                    priceR = amountR * 4.5;
                    priceL = amountL * 4.15;

                    total = (priceH + priceR + priceL) * 0.80;
                    total = total + 2;
                    System.out.printf("%.2f", total);
                    break;
            }


        } else if (yesOrno.equals("N") && totalCount < 20) {
            switch (season) {
                case "Winter":
                    priceH = amountH * 3.75;
                    priceR = amountR * 4.5;
                    priceL = amountL * 4.15;

                    if (amountR >= 10 ) {

                        total = (priceH + priceR + priceL) * 0.90;
                    } else
                        total = (priceH + priceR + priceL);
                    total = total + 2;
                    System.out.printf("%.2f", total);
                    break;
                case "Autumn":
                    priceH = amountH * 3.75;
                    priceR = amountR * 4.5;
                    priceL = amountL * 4.15;

                    total = (priceH + priceR + priceL);
                    total = total + 2;
                    System.out.printf("%.2f", total);
                    break;
            }
        }
    }
}