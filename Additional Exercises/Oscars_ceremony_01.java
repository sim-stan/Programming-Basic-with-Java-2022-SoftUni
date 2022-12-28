package Dopulnitelni_Zadachi___;

import java.util.Scanner;

public class Oscars_ceremony_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rent = Integer.parseInt(scanner.nextLine());


        double statue = rent * 0.70;
        double catering = statue * 0.85;
        double sound = catering/2.0;
        double totalSum = rent + statue + catering + sound;
        System.out.printf("%.2f",totalSum);
    }
}
