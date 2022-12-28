package Dopulnitelni_Zadachi___;

import java.util.Scanner;

public class LAb_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = Integer.parseInt(scanner.nextLine());


        int totalSum = 0;

        while (sum>totalSum) {

            int number =Integer.parseInt(scanner.nextLine());

            totalSum += number;


        }
        System.out.printf("%d",totalSum);
    }
}
