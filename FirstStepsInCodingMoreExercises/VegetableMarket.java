package FirstStepsInCodingMoreExercises;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {

        // euro = 1.94 lev
        Scanner scanner = new Scanner(System.in);
        double veg = Double.parseDouble(scanner.nextLine());
        double fru = Double.parseDouble(scanner.nextLine());
        double amountveg = Double.parseDouble(scanner.nextLine());
        double amountfru = Double.parseDouble(scanner.nextLine());
        double totalLev = (veg * amountveg) + (fru * amountfru);
        double totalEuro = totalLev / 1.94;

        System.out.printf("%.2f", totalEuro);

    }
}
