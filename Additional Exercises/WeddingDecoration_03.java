package Dopulnitelni_Zadachi___;

import java.util.Scanner;

public class WeddingDecoration_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());

        String command = scanner.nextLine();

        double totalSum = 0;
        int flower = 0;
        int balloons = 0;
        int candles = 0;
        int ribbon = 0;
        double ribonprice = 0;
        double flowerprice = 0;
        double balloonprice = 0;
        double candleprice = 0;


        while (!command.equals("stop")) {

            String product = command;
            int count = Integer.parseInt(scanner.nextLine());




            if (product.equals("balloons")) {

                balloonprice += count * 0.1;
                balloons+=count;
            } else if (product.equals("flowers")) {

                flowerprice += count * 1.5;
                flower+=count;
            } else if (product.equals("candles")) {

                candleprice += count * 0.5;
                candles+=count;
            } else if (product.equals("ribbon")) {

                ribonprice += count * 2;
                ribbon+=count;
            }
            totalSum = balloonprice + flowerprice + candleprice + ribonprice;
            if (budget < totalSum) {
                break;
            }
                command = scanner.nextLine();
        }

            double diff = budget - totalSum;

        if (command.equals("stop")) {
            System.out.printf("Spend money: %.2f%n",totalSum);
            System.out.printf("Money left: %.2f%n",diff);
            System.out.printf("Purchased decoration is %d balloons, %d m ribbon,%d flowers and %d candles.",balloons,ribbon,flower,candles);
        } else  {
            System.out.printf("All money is spent!%n");
            System.out.printf("Purchased decoration is %d balloons, %d m ribbon,%d flowers and %d candles.",balloons,ribbon,flower,candles);;
        }
    }


}
