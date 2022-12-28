package For_Loop_More_Exercise;

import java.util.Scanner;

public class Grades_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentCount = Integer.parseInt(scanner.nextLine());


        double topstudents = 0;
        double between4and5 = 0;
        double between3and4 = 0;
        double fail = 0;
        double average = 0;


        for (int i = 1; i <= studentCount; i++) {

            double grade = Double.parseDouble(scanner.nextLine());
            if (grade >= 5.00) {
                topstudents += 1;
                average += grade;
            } else if (grade >= 4.00 && grade <= 4.99) {
                average += grade;
                between4and5 += 1;
            } else if (grade >=3.00 && grade <= 3.99) {
                average += grade;
                between3and4 += 1;

            } else if (grade < 3.00) {
                average += grade;
                fail += 1;

            }
        }
        topstudents = topstudents/studentCount *100;
        between4and5 = between4and5/studentCount * 100;
        between3and4 = between3and4/studentCount *100;
        fail = fail/studentCount *100;
        average = average/studentCount;

        System.out.printf("Top students: %.2f%%%n",topstudents);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n",between4and5);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n",between3and4);
        System.out.printf("Fail: %.2f%%%n",fail);
        System.out.printf("Average: %.2f",average);
    }
}