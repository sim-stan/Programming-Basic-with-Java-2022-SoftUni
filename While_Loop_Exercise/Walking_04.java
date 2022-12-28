package While_Loop_Exercise;

import java.util.Scanner;

public class Walking_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stepsCount = 0;

        String command = scanner.nextLine();

        while (!command.equals("Going home")) {

            int steps = Integer.parseInt(command);

            stepsCount=stepsCount + steps;

        if (stepsCount>=10000) {
            break;
        }


        command = scanner.nextLine();
        }
        if (command.equals("Going home")) {
            int steps= Integer.parseInt(scanner.nextLine());
            stepsCount = stepsCount + steps;
        }

        int diff = Math.abs(10000-stepsCount);

        if (stepsCount>=10000) {
            System.out.printf("Goal reached! Good job!%n%d steps over the goal!",diff);


        } else {

            System.out.printf("%d more steps to reach goal.",diff);
        }

    }


}
