package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class FishingBoat_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermansCount = Integer.parseInt(scanner.nextLine());


        double shiprent = 0.0;

        switch (season) {
            case "Spring" :
             shiprent = 3000.0;
             break;
            case "Summer":
            case "Autumn":
                shiprent= 4200.0;
                break;
            case "Winter":
                shiprent= 2600.0;
                break;
        }

        if (fishermansCount<=6) {
            shiprent = shiprent * 0.90;
        } else if (fishermansCount>=7 && fishermansCount<=11) {
            shiprent = shiprent * 0.85;
            
        } else if (fishermansCount>11) {
            shiprent = shiprent * 0.75;

        }
        if (fishermansCount%2==0 && !(season.equals("Autumn"))) {
            shiprent = shiprent * 0.95;
        }

        double diff =Math.abs( budget - shiprent);
        if ((budget>=shiprent)) {
            System.out.printf("Yes! You have %.2f leva left.", diff);
        }else {
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }
    }
}
