package ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class CarToGo_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String classcar = "";
        String kindofcar = "";
        double price = 0.0;

        if (budget <= 100) {

            classcar = "Economy class";

            if (season.equals("Summer")) {
                kindofcar = "Cabrio";
                price = budget * 0.35;
            } else if (season.equals("Winter")) {
                kindofcar = "Jeep";
                price = budget * 0.65;
            }

        } else if (budget > 100 && budget <= 500) {

            classcar = "Compact class";

            if (season.equals("Summer")) {
                kindofcar = "Cabrio";
                price = budget * 0.45;
            } else if (season.equals("Winter")) {
                kindofcar = "Jeep";
                price = budget * 0.80;
            }
        } else if (budget > 500) {

            classcar = "Luxury class";

            if (season.equals("Summer")) {
                kindofcar = "Jeep";
                price = budget * 0.90;
            } else if (season.equals("Winter")) {
                kindofcar = "Jeep";
                price = budget * 0.90;
            }
        }
        System.out.printf("%s %n",classcar);
        System.out.printf("%s - %.2f",kindofcar , price);
    }
}