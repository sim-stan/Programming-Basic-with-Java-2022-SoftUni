package Dopulnitelni_Zadachi___;

import java.util.Scanner;

public class exercise_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int totalsteps=0;


        while (!command.equals("Going home")) {

            int steps = Integer.parseInt(command);

            totalsteps+=steps;


            if (totalsteps>=10000){

                break;
            }

            command= scanner.nextLine();
        }
if (command.equals("Going home")) {
    int steps= Integer.parseInt(scanner.nextLine());
    totalsteps+=steps;
}
        int diff=Math.abs(totalsteps-10000);

        if (totalsteps>=10000){

            System.out.printf("Goal reached! Good job!%n%d steps over the goal!.",diff);
        }else {
            System.out.printf("%d more steps to reach goal.",diff);
        }
    }
}
