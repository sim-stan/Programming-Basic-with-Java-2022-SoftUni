package Dopulnitelni_Zadachi___;

import java.util.Scanner;

public class Film_Premiere_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        String upgrade = scanner.nextLine();
        int ticketsCount = Integer.parseInt(scanner.nextLine());

        double totalSum =0.0;


        switch (movieName){

            case "John Wick":



                if (upgrade.equals("Drink")) {
                    totalSum = ticketsCount * 12.00;
                    
                } else if (upgrade.equals("Popcorn")) {
                    totalSum = ticketsCount * 15.00;
                    
                } else if (upgrade.equals("Menu")) {
                    totalSum = ticketsCount * 19.00;
                }


                break;

            case "Star Wars":
                if (upgrade.equals("Drink")) {
                    totalSum = ticketsCount * 18.00;

                } else if (upgrade.equals("Popcorn")) {
                    totalSum = ticketsCount * 25.00;

                } else if (upgrade.equals("Menu")) {
                    totalSum = ticketsCount * 30.00;
                }

                break;

            case "Jumanji":
                if (upgrade.equals("Drink")) {
                    totalSum = ticketsCount * 9.00;

                } else if (upgrade.equals("Popcorn")) {
                    totalSum = ticketsCount * 11.00;

                } else if (upgrade.equals("Menu")) {
                    totalSum = ticketsCount * 14.00;
                }




                break;


        }
                if (movieName.equals("Star Wars") && ticketsCount>=4) {
                    totalSum = totalSum* 0.70;
                } else if (movieName.equals("Jumanji")  && ticketsCount==2) {
                    totalSum = totalSum * 0.85;
                }

        System.out.printf("Your bill is %.2f leva.",totalSum);
    }
}
