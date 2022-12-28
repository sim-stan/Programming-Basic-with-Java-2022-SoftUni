package Dopulnitelni_Zadachi___;

import java.util.Scanner;

public class Easter_Bake_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int breadCount = Integer.parseInt(scanner.nextLine());

        int maxsugar = Integer.MIN_VALUE;
        int maxFlour = Integer.MIN_VALUE;

        int totalsugar = 0;
        int totalflour = 0;


        for (int i = 1; i <=breadCount ; i++) {

            int sugar= Integer.parseInt(scanner.nextLine());
            int flour = Integer.parseInt(scanner.nextLine());

            totalflour +=flour;
            totalsugar +=sugar;

            if (flour>maxFlour)
                maxFlour=flour;
            if (sugar>maxsugar) {
                maxsugar=sugar;
            }


        }

       double packsSugar = Math.ceil(totalsugar / 950.00);

        double packsFlour =Math.ceil(totalflour /750.00);


        System.out.printf("Sugar: %.0f%n",packsSugar);
        System.out.printf("Flour: %.0f%n",packsFlour);
        System.out.printf("Max used flour is %d grams, max used sugar is %d grams.",maxFlour,maxsugar);
    }
}
