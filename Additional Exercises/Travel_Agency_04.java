package Dopulnitelni_Zadachi___;

import java.util.Scanner;

public class Travel_Agency_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String city = scanner.nextLine();
        String pacageType = scanner.nextLine();
        String discount = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());


        double price = 0.0;

        switch (city) {

            case "Bansko":
            case "Borovets":

                if (nights > 7) {
                    nights--;

                }
                if (pacageType.equals("noEquipment") && discount.equals("no")) {
                    price = nights * 80;
                } else if (pacageType.equals("noEquipment") && discount.equals("yes")) {
                    price = nights * (80 * 0.95);
                } else if (pacageType.equals("withEquipment") && discount.equals("no")) {
                    price = nights * 100;
                } else if (pacageType.equals("withEquipment") && discount.equals("yes")) {
                    price = nights * (100 * 0.90);



                }else {
                    System.out.println("Invalid input!");
                }
                break;

            case "Varna":
            case "Burgas":

                if (nights > 7) {
                    nights--;

                }

                if (pacageType.equals("noBreakfast") && discount.equals("no")) {
                    price = nights * 100;
                } else if (pacageType.equals("noBreakfast") && discount.equals("yes")) {
                    price = nights * (100 * 0.93);
                } else if (pacageType.equals("withBreakfast") && discount.equals("no")) {
                    price = nights * 130;
                } else if (pacageType.equals("withBreakfast") && discount.equals("yes")) {
                    price = nights * (130 * 0.88);

                }
                break;

                default:
                      System.out.println("Invalid input!");

                break;

          }
        if (nights<=0) {
            System.out.println("Days must be positive number!");
        } else  {
            System.out.printf("The price is %.2flv! Have a nice time!",price);
        }
    }
}