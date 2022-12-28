package ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class SchoolCamp_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String grouptipe = scanner.nextLine();
        int studentsCount = Integer.parseInt(scanner.nextLine());
        int nightsCount = Integer.parseInt(scanner.nextLine());


        String sport = "";
        double price = 0.0;


        if (season.equals("Winter") && grouptipe.equals("boys")) {

            sport = "Judo";
            price = studentsCount * nightsCount * 9.6;

            if (studentsCount >= 50) {
                price = price * 0.50;
            } else if (studentsCount >= 20 && studentsCount < 50) {
                price = price * 0.85;
            } else if (studentsCount >= 10 && studentsCount < 20) {
                price = price * 0.95;
            }

        } else if (season.equals("Winter") && grouptipe.equals("girls")) {

            sport = "Gymnastics";
            price = studentsCount * nightsCount * 9.6;

            if (studentsCount >= 50) {
                price = price * 0.50;
            } else if (studentsCount >= 20 && studentsCount < 50) {
                price = price * 0.85;
            } else if (studentsCount >= 10 && studentsCount < 20) {
                price = price * 0.95;
            }

        } else if (season.equals("Winter") && grouptipe.equals("mixed")) {

            sport = "Ski";
            price = studentsCount * nightsCount * 10;

            if (studentsCount >= 50) {
                price = price * 0.50;
            } else if (studentsCount >= 20 && studentsCount < 50) {
                price = price * 0.85;
            } else if (studentsCount >= 10 && studentsCount < 20) {
                price = price * 0.95;
            }

        }
        if (season.equals("Spring") && grouptipe.equals("boys")) {

            sport = "Tennis";
            price = studentsCount * nightsCount * 7.2;

            if (studentsCount >= 50) {
                price = price * 0.50;
            } else if (studentsCount >= 20 && studentsCount < 50) {
                price = price * 0.85;
            } else if (studentsCount >= 10 && studentsCount < 20) {
                price = price * 0.95;
            }

        } else if (season.equals("Spring") && grouptipe.equals("girls")) {

            sport = "Athletics";
            price = studentsCount * nightsCount * 7.2;

            if (studentsCount >= 50) {
                price = price * 0.50;
            } else if (studentsCount >= 20 && studentsCount < 50) {
                price = price * 0.85;
            } else if (studentsCount >= 10 && studentsCount < 20) {
                price = price * 0.95;
            }

        } else if (season.equals("Spring") && grouptipe.equals("mixed")) {

            sport = "Cycling";
            price = studentsCount * nightsCount * 9.5;

            if (studentsCount >= 50) {
                price = price * 0.50;
            } else if (studentsCount >= 20 && studentsCount < 50) {
                price = price * 0.85;
            } else if (studentsCount >= 10 && studentsCount < 20) {
                price = price * 0.95;
            }
        }
        if (season.equals("Summer") && grouptipe.equals("boys")) {

            sport = "Football";
            price = studentsCount * nightsCount * 15;

            if (studentsCount >= 50) {
                price = price * 0.50;
            } else if (studentsCount >= 20 && studentsCount < 50) {
                price = price * 0.85;
            } else if (studentsCount >= 10 && studentsCount < 20) {
                price = price * 0.95;
            }

        } else if (season.equals("Summer") && grouptipe.equals("girls")) {

            sport = "Volleyball";
            price = studentsCount * nightsCount * 15;

            if (studentsCount >= 50) {
                price = price * 0.50;
            } else if (studentsCount >= 20 && studentsCount < 50) {
                price = price * 0.85;
            } else if (studentsCount >= 10 && studentsCount < 20) {
                price = price * 0.95;
            }

        } else if (season.equals("Summer") && grouptipe.equals("mixed")) {

            sport = "Swimming";
            price = studentsCount * nightsCount * 20;

            if (studentsCount >= 50) {
                price = price * 0.50;
            } else if (studentsCount >= 20 && studentsCount < 50) {
                price = price * 0.85;
            } else if (studentsCount >= 10 && studentsCount < 20) {
                price = price * 0.95;
            }
        }
        System.out.printf("%s %.2f lv.", sport , price);
    }
}