package Dopulnitelni_Zadachi___;

import java.util.Scanner;

public class Series_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Thrones – 50%
        // Lucifer – 40%
        // Protector – 30%
        // TotalDrama – 20%
        // Area – 10%

        double budget = Double.parseDouble(scanner.nextLine());
        int numberofmovies = Integer.parseInt(scanner.nextLine());


        double totalprice = 0.0;
        double diff = 0.0;
        double price = 0.0;

        for (int i = 0; i < numberofmovies; i++) {

        String movieName = scanner.nextLine();
        double priceserial = Double.parseDouble(scanner.nextLine());

        switch (movieName) {

            case "Thrones":
                price = priceserial/2;
                totalprice +=price;
                break;
            case "Lucifer":
                price = priceserial * 0.60;
                totalprice +=price;
                break;
            case "Protector":
                price = priceserial * 0.70;
                totalprice +=price;
                break;

            case "TotalDrama":
                price = priceserial * 0.80;
                totalprice +=price;
                break;

            case "Area":
                price = priceserial * 0.90;
                totalprice +=price;
                break;

            default:
                price= priceserial;
                totalprice+=priceserial;
                break;
        }




        }

        diff = Math.abs(budget-totalprice);

        if (budget>=totalprice){
            System.out.printf("You bought all the series and left with %.2f lv.",diff);

        } else {
            System.out.printf("You need %.2f lv. more to buy the series!",diff);
        }




    }
}
