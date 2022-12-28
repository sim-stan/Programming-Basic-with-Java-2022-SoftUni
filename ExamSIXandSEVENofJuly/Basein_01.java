package ExamSIXandSEVENofJuly;

import java.util.Scanner;

public class Basein_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPpl = Integer.parseInt(scanner.nextLine());
        double taxEntry = Double.parseDouble(scanner.nextLine());
        double priceBed = Double.parseDouble(scanner.nextLine());
        double priceUmbrella = Double.parseDouble(scanner.nextLine());

        double entryTotal=totalPpl*taxEntry;
        double pplwithBed=Math.ceil(totalPpl*0.75);
        double bedPrice=pplwithBed*priceBed;
        double pplUmbrella =Math.ceil(totalPpl*0.5);
        double umbrellaprice=pplUmbrella * priceUmbrella;

        double total= entryTotal + bedPrice + umbrellaprice;



        System.out.printf("%.2f lv.",total);

    }
}
