package Nested_Loops_Exercise_;

import java.util.Scanner;

public class Train_The_Trainers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juryCount = Integer.parseInt(scanner.nextLine());

        double gradeSum=0.0;
        int gradescount=0;

        String command = scanner.nextLine();

        while (!command.equals("Finish")) {
            String presentation = command;

                double currentgradeSum=0.0;

            for (int i = 1; i <=juryCount ; i++) {

                double grade = Double.parseDouble(scanner.nextLine());
                gradescount++;
                gradeSum = gradeSum + grade;
                currentgradeSum +=grade;

            }

            System.out.printf("%s - %.2f.%n",presentation,currentgradeSum/juryCount);

            command= scanner.nextLine();
        }

        System.out.printf("Student's final assessment is %.2f.",gradeSum/gradescount);
    }
}
