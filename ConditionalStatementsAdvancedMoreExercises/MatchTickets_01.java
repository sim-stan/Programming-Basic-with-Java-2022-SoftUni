package ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class MatchTickets_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int groupAmount = Integer.parseInt(scanner.nextLine());

        double diff = 0.0;
        double tripPrice = 0.0;
        double tickets = 0.0;
        //System.out.printf("Yes you have %.2f", diff);


        if (category.equals("VIP")) {

            if (groupAmount > 0 && groupAmount < 5) {
                tripPrice = (budget * 0.25);
                     tickets =    (groupAmount * 499.99);
                diff = Math.abs((groupAmount * 499.99) - (budget * 0.25));
            } else if (groupAmount >= 5 && groupAmount <= 9) {
                tripPrice = (budget * 0.40);
                tickets =    (groupAmount * 499.99);
                diff = Math.abs((groupAmount * 499.99) - (budget * 0.40));
            } else if (groupAmount >= 10 && groupAmount <= 24) {
                tripPrice = (budget * 0.50);
                tickets =    (groupAmount * 499.99);

                diff = Math.abs((groupAmount * 499.99) - (budget * 0.50));
            } else if (groupAmount >= 25 && groupAmount <= 49) {

                tripPrice = (budget * 0.60);
                tickets =    (groupAmount * 499.99);
                diff = Math.abs((groupAmount * 499.99) - (budget * 0.60));

            } else if (groupAmount >= 50) {
                tripPrice = (budget * 0.75);
                tickets =    (groupAmount * 499.99);
                diff = Math.abs((groupAmount * 499.99) - (budget * 0.75));
            }
        } else if (category.equals("Normal")) {
            if (groupAmount > 0 && groupAmount < 5) {
                tripPrice = (budget * 0.25);
                tickets =    (groupAmount * 249.99);
                diff = Math.abs((groupAmount * 249.99) - (budget * 0.25));
            } else if (groupAmount >= 5 && groupAmount <= 9) {
                tripPrice = (budget * 0.40);
                tickets =    (groupAmount * 249.99);
                diff = Math.abs((groupAmount * 249.99) - (budget * 0.40));
            } else if (groupAmount >= 10 && groupAmount <= 24) {
                tripPrice = (budget * 0.50);
                tickets =    (groupAmount * 249.99);
                diff = Math.abs((groupAmount * 249.99) - (budget * 0.50));
            } else if (groupAmount >= 25 && groupAmount <= 49) {
                tripPrice = (budget * 0.60);
                tickets =    (groupAmount * 249.99);
                diff = Math.abs((groupAmount * 249.99) - (budget * 0.60));

            } else if (groupAmount >= 50) {
                tripPrice = (budget * 0.75);
                tickets =    (groupAmount * 249.99);
                diff = Math.abs((groupAmount * 249.99) - (budget * 0.75));

            }

        }
        if (tripPrice > tickets) {
            System.out.printf("Yes! You have %.2f leva left.", diff);
        } else if (tripPrice< tickets){
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }
    }
}