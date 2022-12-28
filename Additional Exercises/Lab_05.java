package Dopulnitelni_Zadachi___;

import java.util.Scanner;

public class Lab_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        String command = scanner.nextLine();
        double totoalMoney = 0;

        while (!command.equals("NoMoreMoney")) {

            double amount = Double.parseDouble(command);

        if (amount<0) {
            System.out.printf("Invalid operation!%n");
            break;
        }
            System.out.printf("Increase: %.2f%n",amount);
            totoalMoney = totoalMoney + amount;

            command= scanner.nextLine();
        }

        System.out.printf("Total: %.2f",totoalMoney);


    }
}
