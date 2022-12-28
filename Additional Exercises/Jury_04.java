package Dopulnitelni_Zadachi___;

import java.util.Scanner;

public class Jury_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juryCount = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        double totalGrade=0;
        int gradeCount=0;

        while (!command.equals("Finish")) {

            double currentGrade=0.0;
            String nameofPresentation= command;


            for (int i = 1; i <=juryCount ; i++) {

                double grade = Double.parseDouble(scanner.nextLine());

                gradeCount ++;
                currentGrade= currentGrade+grade;



            }
            totalGrade+=currentGrade;

            System.out.printf("%s - %.2f%n",nameofPresentation,currentGrade/juryCount);

            command= scanner.nextLine();
        }


        System.out.printf("Student's final assessment is %.2f.",totalGrade/gradeCount);





    }
}
