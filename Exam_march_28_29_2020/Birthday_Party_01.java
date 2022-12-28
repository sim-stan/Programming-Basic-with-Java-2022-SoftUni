package Exam_march_28_29_2020;

import java.util.Scanner;

public class Birthday_Party_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double rent = Double.parseDouble(scanner.nextLine());

        double cake = rent*0.2;
        double drinks=cake * 0.55;
        double animator= rent*1/3;
        double total = rent + cake + drinks + animator;
        System.out.printf("%.2f",total);

    }
}
