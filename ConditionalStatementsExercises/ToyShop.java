package ConditionalStatementsExercises;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        double trimpPrice = Double.parseDouble(scanner.nextLine());
        int puzzleCount = Integer.parseInt(scanner.nextLine());
        int dollsCount = Integer.parseInt(scanner.nextLine());
        int bearsCount = Integer.parseInt(scanner.nextLine());
        int minionCounts= Integer.parseInt(scanner.nextLine());
        int trucksCounts = Integer.parseInt(scanner.nextLine());

        double totalPrice = (puzzleCount * 2.6) + (dollsCount* 3 ) +
                (bearsCount * 4.1) + (minionCounts * 8.2) + (trucksCounts * 2);

        double totalCount = puzzleCount + dollsCount + bearsCount + minionCounts +trucksCounts;

        if (totalCount >= 50) {

            totalPrice = totalPrice * 0.75;


        }
        totalPrice= totalPrice *0.90;

        double diff = Math.abs(totalPrice - trimpPrice);

        if (totalPrice >= trimpPrice) {

            System.out.printf("Yes! %.2f lv left.", diff);
        } else
            System.out.printf("Not enough money! %.2f lv needed.", diff);




    }
}
