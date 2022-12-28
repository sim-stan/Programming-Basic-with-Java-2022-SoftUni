package Dopulnitelni_Zadachi___;

import java.util.Scanner;

public class Pool_Day_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int pplCount = Integer.parseInt(scanner.nextLine());
        double taxperPerson = Double.parseDouble(scanner.nextLine());
        double pricesinglebed = Double.parseDouble(scanner.nextLine());
        double pricesingleumbrella = Double.parseDouble(scanner.nextLine());

        double totaltax =1.00* pplCount * taxperPerson;
        double totalbeds = Math.ceil( pplCount * 0.75);
        double totalbedsprice = (totalbeds * pricesinglebed);
        double totalumbrela = Math.ceil(1.00 * pplCount /2);
        double umbrellaprice =( totalumbrela * pricesingleumbrella);

        double totalSum = umbrellaprice + totaltax + totalbedsprice;

        System.out.printf("%.2f",totalSum);
    }
}
