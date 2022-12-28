package ConditionalStatementsMOREexercises;

import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int daysoff = Integer.parseInt(scanner.nextLine());


        int workingdaysayear = 365 - daysoff;
        int workingdaysplaytime = workingdaysayear * 63;
        int daysoffplaytime = daysoff * 127;
        int totalplaytime = workingdaysplaytime + daysoffplaytime;

        int leftminutes = Math.abs(30000 - totalplaytime);


        double diffhours = Math.floor(leftminutes / 60.0);
        double diffmin = Math.abs(Math.floor(leftminutes % 60.0));


        if (totalplaytime > 30000) {


            System.out.println("Tom will run away");
            System.out.printf("%.0f hours and %.0f minutes more for play", diffhours, diffmin);

        } else {
            System.out.println("Tom sleeps well");
            System.out.printf("%.0f hours and %.0f minutes less for play", diffhours, diffmin);

        }
    }

}

