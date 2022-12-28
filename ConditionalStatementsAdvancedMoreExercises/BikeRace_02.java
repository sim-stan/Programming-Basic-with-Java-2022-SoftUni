package ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class BikeRace_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int juniorracers = Integer.parseInt(scanner.nextLine());
        int seniorracers = Integer.parseInt(scanner.nextLine());
        String tipetail = scanner.nextLine();

        double juniortrail = juniorracers * 5.50;
        double juniorcrossCountry = juniorracers * 8;
        double juniordownhill = juniorracers * 12.25;
        double juniorroad = juniorracers * 20;

        double seniorstrail = seniorracers * 7;
        double seniorcrossCountry = seniorracers * 9.5;
        double seniordownhill = seniorracers * 13.75;
        double seniorroad = seniorracers * 21.5;
        double totalracers = juniorracers + seniorracers;
        double total = 0.0;

        if (tipetail.equals("trail")) {
           total= seniorstrail + juniortrail;

        } else if (tipetail.equals("cross-country")) {
            total= seniorcrossCountry + juniorcrossCountry;

            if (totalracers >= 50) {
                total = total * 0.75;
            }
        }else if (tipetail.equals("downhill")) {
            total = seniordownhill + juniordownhill;

        }else if (tipetail.equals("road")) {
            total = seniorroad + juniorroad;

        }
        total = total * 0.95;
        System.out.printf("%.2f",total);
    }
}
