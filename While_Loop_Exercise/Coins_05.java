package While_Loop_Exercise;

import java.util.Scanner;

public class Coins_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double change = Double.parseDouble(scanner.nextLine());
        double changeIncoins = change * 100;
        int coinsCount = 0;

        while (changeIncoins > 0) {

            if (changeIncoins >= 200) {
                changeIncoins = changeIncoins - 200;

            } else if (changeIncoins >= 100) {
                changeIncoins = changeIncoins - 100;

            } else if (changeIncoins >= 50) {
                changeIncoins = changeIncoins - 50;

            } else if (changeIncoins >= 20) {
                changeIncoins = changeIncoins - 20;

            } else if (changeIncoins >= 10) {
                changeIncoins = changeIncoins - 10;

            } else if (changeIncoins >= 5) {
                changeIncoins = changeIncoins - 5;

            } else if (changeIncoins >= 2) {
                changeIncoins = changeIncoins - 2;

            } else if (changeIncoins >= 1) {
                changeIncoins = changeIncoins - 1;

            } else {
                break;
            }
            coinsCount ++;
        }
        System.out.printf("%d",coinsCount);
    }

}

