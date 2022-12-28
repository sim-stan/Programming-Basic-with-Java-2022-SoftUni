package For_Loop_Exercise;

import java.util.Scanner;

public class CleverLily_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washingMachineprice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        int evenBdaymoney = 0;
        int totalsum = 0;

        int toysCount = 0;
        double diff = 0;

        for (int i = 1; i <= age; i++) {

            if (i % 2 == 0) {
                evenBdaymoney += 10;
                totalsum += evenBdaymoney;
                totalsum -= 1;
            } else {
                toysCount++;

            }
        }
        totalsum += toysCount * toyPrice;

        diff = Math.abs(totalsum - washingMachineprice);
        if (totalsum>= washingMachineprice) {


            System.out.printf("Yes! %.2f", diff);

        }else {
            System.out.printf("No! %.2f", diff);
        }
    }
}
