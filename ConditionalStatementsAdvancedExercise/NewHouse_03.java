package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class NewHouse_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String kindOfflowers = scanner.nextLine();
        int countFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double totalprice = 0.0;
        switch (kindOfflowers) {
            case "Roses":
                totalprice = countFlowers * 5;
                if (countFlowers > 80) {
                    totalprice =totalprice * 0.9;
                } break;
            case "Dahlias":
                    totalprice = countFlowers * 3.8;
                if (countFlowers > 90) {
                    totalprice = totalprice * 0.85;
                } break;
            case "Tulips":
            totalprice = countFlowers * 2.8;
                if (countFlowers > 80) {
                    totalprice = totalprice * 0.85;
                } break;
            case "Narcissus":
                totalprice = countFlowers * 3;
                if (countFlowers > 120) {
                    totalprice = totalprice * 1.15;
                } break;
            case "Gladiolus":
                totalprice = countFlowers * 2.5;
                if (countFlowers < 80) {
                    totalprice = totalprice * 1.2;
                }break;
        }
            double diff = Math.abs(budget-totalprice);
            if (budget>= totalprice) {
                System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", countFlowers,kindOfflowers,diff);
            } else {
                System.out.printf("Not enough money, you need %.2f leva more.", diff);
            }
    }
}

