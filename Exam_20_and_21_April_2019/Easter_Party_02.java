package Exam_20_and_21_April_2019;

import java.util.Scanner;

public class Easter_Party_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guestsAmount = Integer.parseInt(scanner.nextLine());
        double priceperGuest = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());
        double total=guestsAmount*priceperGuest;
        if (guestsAmount>=10 && guestsAmount<=15) {

            total=guestsAmount* (priceperGuest*0.85);
        } else if (guestsAmount>15 && guestsAmount<=20) {
            total=guestsAmount* (priceperGuest*0.80);
        } else if (guestsAmount>20) {
            total=guestsAmount* (priceperGuest*0.75);
        }

        total=total + (budget*0.10);
        double diff= Math.abs(budget-total);
        if (budget>=total) {
            System.out.printf("It is party time! %.2f leva left.",diff);
        }else {
            System.out.printf("No party! %.2f leva needed.",diff);
        }
    }
}
