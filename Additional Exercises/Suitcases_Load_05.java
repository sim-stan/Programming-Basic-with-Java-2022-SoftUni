package Dopulnitelni_Zadachi___;

import java.util.Scanner;

public class Suitcases_Load_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double capacity =Double.parseDouble(scanner.nextLine());

        String command = scanner.nextLine();

        double totalLuggage =0;
        int luggageCount = 0;

        while (!command.equals("End")) {

            double luggageCapacity = Double.parseDouble(command);
            luggageCount ++;


             if (luggageCount %3==0) {
                luggageCapacity = luggageCapacity * 1.10;
            }


            totalLuggage = totalLuggage + luggageCapacity;

            if (totalLuggage>capacity) {
                totalLuggage = totalLuggage;
                luggageCount--;
                break;
            }

            command = scanner.nextLine();
        }
            if (command.equals("End")) {
                System.out.printf("Congratulations! All suitcases are loaded!%n");
                System.out.printf("Statistic: %d suitcases loaded.",luggageCount);
            } else {
                System.out.printf("No more space!%n");
                System.out.printf("Statistic: %d suitcases loaded.",luggageCount);
            }

    }
}
