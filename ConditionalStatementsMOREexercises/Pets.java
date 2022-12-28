package ConditionalStatementsMOREexercises;

import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int days = Integer.parseInt(scanner.nextLine());

        int totalfood = Integer.parseInt(scanner.nextLine());
        double foodperdayDog = Double.parseDouble(scanner.nextLine());
        double foodperdaycat = Double.parseDouble(scanner.nextLine());
        double foodperdayturtuga = Double.parseDouble(scanner.nextLine());

        double totaldogFood = days * foodperdayDog;
        double totalcatFood = days * foodperdaycat;
        double totalturtugaFood = days * foodperdayturtuga/1000;


        double totalanimalfood = totaldogFood + totalcatFood + totalturtugaFood;

        double diff = Math.abs(totalfood - totalanimalfood );


        if (totalfood>=totalanimalfood) {

           diff  = Math.floor(diff);

            System.out.printf("%.0f kilos of food left.", diff);


        } else {

            diff= Math.ceil(diff);

            System.out.printf("%.0f more kilos of food are needed.", diff);
        }

    }
}
