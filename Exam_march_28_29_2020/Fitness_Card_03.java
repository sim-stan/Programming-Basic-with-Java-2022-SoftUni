package Exam_march_28_29_2020;

import java.util.Scanner;

public class Fitness_Card_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());

        String sex= scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String sport= scanner.nextLine();

            double price=0.0;

        if (sex.equals("m")) {

            switch (sport) {
                case "Gym":
                    price=42;
                    break;
                case "Boxing":
                    price=41;
                    break;
                case "Yoga":
                    price=45;
                    break;
                case "Zumba":
                   price=34;
                    break;
                case "Dances":
                   price=51;
                    break;
                case "Pilates":
                   price=39;
                    break;

            } if (age<=19) {
                price=price * 0.80;
            }

        } else if (sex.equals("f")) {
            switch (sport) {
                case "Gym":
                    price=35;
                    break;
                case "Boxing":
                    price=37;
                    break;
                case "Yoga":
                    price=42;
                    break;
                case "Zumba":
                    price=31;
                    break;
                case "Dances":
                    price=53;
                    break;
                case "Pilates":
                    price=37;
                    break;

            } if (age<=19) {
                price=price * 0.80;
            }

        }

        double diff=Math.abs(budget-price);
        if (price>budget){
            System.out.printf("You don't have enough money! You need $%.2f more.",diff);
        }else {
            System.out.printf("You purchased a 1 month pass for %s.",sport);
        }

    }
}
