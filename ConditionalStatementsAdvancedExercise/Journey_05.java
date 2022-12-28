package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class Journey_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double price= 0.0;


        String place = "";
        String country = "";

        if (budget<=100) {
            country = "Bulgaria";
            if (season.equals("summer")) {
                price = budget * 0.30;
                place = "Camp";

            } else if (season.equals("winter")) {
                price= budget *0.70;
                place = "Hotel";

            }

        } else if (budget>100 && budget<=1000 ) {
            country = "Balkans";
            if (season.equals("summer")) {
                price = budget * 0.40;
                place = "Camp";
            } else if (season.equals("winter")) {
                price = budget * 0.80;
                place = "Hotel";
            }

        } else if (budget>1000) {
            country = "Europe";
            price = budget*0.90;
            place = "Hotel";
        }

        System.out.printf("Somewhere in %s %n",country);
        System.out.printf("%s - %.2f",place,price);
    }
}
