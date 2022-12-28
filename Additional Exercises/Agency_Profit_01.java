package Dopulnitelni_Zadachi___;

import java.util.Scanner;

public class Agency_Profit_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String airlineName = scanner.nextLine();
        int adultsTickets = Integer.parseInt(scanner.nextLine());
        int kidsTickets = Integer.parseInt(scanner.nextLine());
        double netAdultticket = Double.parseDouble(scanner.nextLine());
        double taxPrice = Double.parseDouble(scanner.nextLine());



        double kidsticketprice = (netAdultticket * 0.30);
        double adultfullprice = netAdultticket + taxPrice;
        double kidsfullprice = kidsticketprice + taxPrice;
        double adulttotal = adultfullprice * adultsTickets;
        double kidstotal = kidsTickets * kidsfullprice;
        double totalticketprice = kidstotal + adulttotal;
        double profit = totalticketprice * 0.20;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.",airlineName,profit);
    }
}
