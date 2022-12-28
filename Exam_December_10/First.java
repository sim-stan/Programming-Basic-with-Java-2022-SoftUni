package Exam_December_10;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pplAmount = Integer.parseInt(scanner.nextLine());
        int nightsAmount = Integer.parseInt(scanner.nextLine());
        int busspassesAmount = Integer.parseInt(scanner.nextLine());
        int museumTickets = Integer.parseInt(scanner.nextLine());


        double nightsTotal= nightsAmount * 20;

        double buspassTotal= busspassesAmount*1.60;
        double museumTotal= museumTickets * 6;
        double totalperPerson= nightsTotal+buspassTotal + museumTotal;
        double totalfortheGroup= totalperPerson*pplAmount;
        double additional=totalfortheGroup*1.25;

        System.out.printf("%.2f",additional);

    }
}
