package While_Loop_Exercise;

import java.util.Scanner;

public class Exam_Preparation_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int badGradetlimit = Integer.parseInt(scanner.nextLine());

        String examname = scanner.nextLine();
        int numberofExams=0;
        double totalGrades = 0;
        String lastProblem ="";
       int  badGradesCount =0;

        while (!examname.equals("Enough")) {
             String taskName = examname;
             int grade = Integer.parseInt(scanner.nextLine());
             numberofExams ++;
             lastProblem = taskName;
             totalGrades = totalGrades + grade;


            if (grade<=4) {
                badGradesCount++;

            }
            if (badGradesCount ==badGradetlimit) {
                break;
            }

            examname = scanner.nextLine();
        }
        if (badGradesCount ==badGradetlimit) {


            System.out.printf("You need a break, %d poor grades.",badGradesCount);

        }else {
            System.out.printf("Average score: %.2f%n", 1.00 * totalGrades / numberofExams);
            System.out.printf("Number of problems: %d%n", numberofExams);
            System.out.printf("Last problem: %s", lastProblem);

        }




    }
}
