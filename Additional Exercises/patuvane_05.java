package Dopulnitelni_Zadachi___;

import java.util.Scanner;

public class patuvane_05 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();




        while (!destination.equals("End")) {
            int moneySHeNeed = Integer.parseInt(scanner.nextLine());
            int totalSum=0;
             while (totalSum<moneySHeNeed) {

                 int moneyshesaved= Integer.parseInt(scanner.nextLine());;

                 totalSum+=moneyshesaved;



                 }
            System.out.printf("Going to %s!%n",destination);
            destination= scanner.nextLine();

        }
    }
}
