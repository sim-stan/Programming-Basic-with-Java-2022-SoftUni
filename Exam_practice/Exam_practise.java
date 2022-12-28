package Exam_practice;

import java.util.Scanner;

public class Exam_practise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int rent = Integer.parseInt(scanner.nextLine());

        double statuetka= rent*0.70;
        double catering= statuetka*0.85;
        double ozvuchavane=catering/2;

        double total= statuetka + catering + ozvuchavane + rent;



            System.out.printf("%.2f",total);



    }
}
