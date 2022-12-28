package Exam_December_10;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tshirtPrice = Double.parseDouble(scanner.nextLine());
        double amountForGift = Double.parseDouble(scanner.nextLine());


        double pants=tshirtPrice*0.75;
        double socks=pants *0.20;
        double snickers= (pants+ tshirtPrice)*2;
        double sum= (tshirtPrice+ pants + socks + snickers) * 0.85;

        double diff= Math.abs(sum-amountForGift);
        if (sum>=amountForGift){
            System.out.printf("Yes, he will earn the world-cup replica ball!%n");
            System.out.printf("His sum is %.2f lv.",sum);
        }else {
            System.out.printf("No, he will not earn the world-cup replica ball.%n");
            System.out.printf("He needs %.2f lv. more.",diff);
        }
    }
}
