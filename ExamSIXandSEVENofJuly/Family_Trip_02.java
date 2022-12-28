package ExamSIXandSEVENofJuly;

import java.util.Scanner;

public class Family_Trip_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int totalNights = Integer.parseInt(scanner.nextLine());
        double priceperNight = Double.parseDouble(scanner.nextLine());
        int extraExpenses = Integer.parseInt(scanner.nextLine());

        if (totalNights>7){
            priceperNight=priceperNight *0.95;
        }


        double total=totalNights*priceperNight + (budget * extraExpenses/100);

        double diff=Math.abs(budget-total);
        if (budget>=total) {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.",diff);

        }else {
            System.out.printf("%.2f leva needed.",diff);
        }
    }
}
