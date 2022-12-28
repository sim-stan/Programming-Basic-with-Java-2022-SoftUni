package Dopulnitelni_Zadachi___;

import java.util.Scanner;

public class zavurshvane_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();


        int year =1;
        int poorGrade=0;
        double totalGrade=0;
        String command = scanner.nextLine();

        while (year<=12) {
            double grade = Double.parseDouble(command);

            if (poorGrade>1) {

                break;
            }
            if (grade<4) {
                poorGrade++;
                continue;
            }
            year++;
            totalGrade=totalGrade+grade;

            command= scanner.nextLine();
        }
            if (poorGrade>1){
                System.out.printf("%s has been excluded at %d grade",name,year);
            }else {
                double avggrade = totalGrade/12;
                System.out.printf("%s graduated. Average grade: %.2f",name,avggrade);
            }
    }
}
