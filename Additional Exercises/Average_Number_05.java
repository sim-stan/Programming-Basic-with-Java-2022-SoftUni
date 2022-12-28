package Dopulnitelni_Zadachi___;

import java.util.Scanner;

public class Average_Number_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        double result=0.0;
        for (int i = 1; i <=num ; i++) {
            int n = Integer.parseInt(scanner.nextLine());
            result=result+n;

        }
        double avg=result/num;
        System.out.printf("%.2f",avg);
    }
}
