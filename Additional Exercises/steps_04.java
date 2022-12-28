package Dopulnitelni_Zadachi___;

import java.util.Scanner;

public class steps_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        String command = scanner.nextLine();
        int totalSteps = 0;

        while (!command.equals("Going home")) {

            int steps = Integer.parseInt(command);
            totalSteps = totalSteps + steps;


            if (totalSteps>=10000) {

                break;
            }


            command= scanner.nextLine();
        }

        if (command.equals("Going home")) {
            int steps = Integer.parseInt(scanner.nextLine());

            totalSteps = totalSteps + steps;


        }

        int diff = Math.abs(totalSteps - 10000);

        if (command.equals("Going home")){
            System.out.printf("%d more steps to reach goal",diff);

        } else {

            System.out.printf("Goal reached! Good job!%n");
            System.out.printf("%d",diff);
        }

    }
}
