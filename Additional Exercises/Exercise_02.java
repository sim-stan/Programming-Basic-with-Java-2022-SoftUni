package Dopulnitelni_Zadachi___;

import java.util.Scanner;

public class Exercise_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int allowedMistake = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        String lastExercise= "";
        int mistakesCount = 0;
        int exerciseCount = 0;
        double gradeSum = 0;

        while (!command.equals("Enough")){

            String nameExercise = command;
            int grade =Integer.parseInt(scanner.nextLine());



            if (grade<=4){
                mistakesCount ++;

            }

            if (mistakesCount>=allowedMistake){
                break;
            }

            gradeSum = grade+ gradeSum;
            exerciseCount++;

            lastExercise=nameExercise;
            command= scanner.nextLine();
        }
    double avggrade = gradeSum/exerciseCount;
            if (command.equals("Enough")) {
                System.out.printf("Average score: %.2f%nNumber of problems: %d%nLast problem: %s",avggrade,exerciseCount,lastExercise);
            }else {
                System.out.printf("You need a break, %d poor grades.",mistakesCount);
            }

    }
}
