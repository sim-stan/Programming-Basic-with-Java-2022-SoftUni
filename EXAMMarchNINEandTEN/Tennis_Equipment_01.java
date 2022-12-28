package EXAMMarchNINEandTEN;

import java.util.Scanner;

public class Tennis_Equipment_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double pricePerRacket = Double.parseDouble(scanner.nextLine());
        int racketCount = Integer.parseInt(scanner.nextLine());
        int snickersCount = Integer.parseInt(scanner.nextLine());

        double snickersprice=pricePerRacket/6;

        double totalRacketprice=pricePerRacket*racketCount;

        double totalsnickersprice=snickersprice*snickersCount;

        double snickersAndrackets= totalRacketprice + totalsnickersprice;

        double additionalexpenses = snickersAndrackets * 0.20;
        double total= additionalexpenses + snickersAndrackets;

        double djokovic=Math.floor( total/8);
        double sponsors=Math.ceil ((total*7)/8);

        System.out.printf("Price to be paid by Djokovic %.0f%n",djokovic);
        System.out.printf("Price to be paid by sponsors %.0f",sponsors);


    }
}
