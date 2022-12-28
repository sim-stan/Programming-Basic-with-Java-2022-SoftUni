package ConditionalStatementsExercises;

import java.util.Scanner;

public class GodzillaKong {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int statisticount = Integer.parseInt(scanner.nextLine());
        double priceUniform = Double.parseDouble(scanner.nextLine());

        double decorprice = budget * 0.10;

        double totalStatistiUniform = statisticount * priceUniform;

        double totalexpens = decorprice + totalStatistiUniform;


        if (statisticount > 150) {


            totalStatistiUniform = totalStatistiUniform * 0.90;

        }

        double diff = Math.abs((totalStatistiUniform + decorprice) - budget);


        if (totalexpens > budget) {


            System.out.printf("Not enough money!  ");
            System.out.println("");
            System.out.printf("Wingard needs %.2f leva more.", diff);


        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.",diff);

        }

    }

}






