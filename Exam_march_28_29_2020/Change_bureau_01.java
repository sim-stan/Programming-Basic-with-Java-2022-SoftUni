package Exam_march_28_29_2020;

import java.util.Scanner;

public class Change_bureau_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int bitcoinCount = Integer.parseInt(scanner.nextLine());
        double yoanCount = Double.parseDouble(scanner.nextLine());
        double comision = Double.parseDouble(scanner.nextLine());

        int bitTolev=bitcoinCount * 1168;
        double yoantodol=yoanCount * 0.15;
        double yoantolev= yoantodol * 1.76;
        double totalleva=yoantolev + bitTolev;
        double totalAmount=totalleva /1.95;
         double total = totalAmount-(totalAmount*comision/100);


        System.out.printf("%.2f",total);
    }
}
