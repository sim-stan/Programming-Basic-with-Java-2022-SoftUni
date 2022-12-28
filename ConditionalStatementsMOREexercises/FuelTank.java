package ConditionalStatementsMOREexercises;

import java.util.Scanner;

public class FuelTank {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String nameFuel = scanner.nextLine();
        double amountFuel = Double.parseDouble(scanner.nextLine());


        switch (nameFuel) {

            case "Diesel":

                if (amountFuel >= 25) {
                    System.out.println("You have enough diesel.");
                    break;
                } else if (amountFuel < 25) {
                    System.out.println("Fill your tank with diesel!");
                    break;

                }
            case "Gasoline":
                if (amountFuel >= 25) {
                    System.out.println("You have enough gasoline.");
                    break;
                } else if (amountFuel < 25) {
                    System.out.println("Fill your tank with gasoline!");
                    break;


                }
            case "Gas":
                if (amountFuel >= 25) {
                    System.out.println("You have enough gas.");
                    break;
                } else if (amountFuel < 25) {
                    System.out.println("Fill your tank with gas!");
                    break;
                }
            default:
                System.out.println("Invalid fuel!");
        }
    }
}