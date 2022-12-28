package FirstStepsInCodingMoreExercises;

import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double makarelpricekilo= Double.parseDouble(scanner.nextLine());
        double cacapricekilo = Double.parseDouble(scanner.nextLine());
        double palamudamount = Double.parseDouble(scanner.nextLine());
        double safridamount = Double.parseDouble(scanner.nextLine());
        int midiamount = Integer.parseInt(scanner.nextLine());

        double palamudprice = makarelpricekilo + (makarelpricekilo*0.60);

        double totalpalamud = palamudprice * palamudamount;

        double safridprice = cacapricekilo + (cacapricekilo*0.80);
        double totalsafrid = safridprice * safridamount;


        double midikilos = 7.50;
        double totalmidi = midiamount * 7.50;

        double amount = totalmidi + totalpalamud + totalsafrid;


        System.out.printf("%.2f", amount);




    }
}
