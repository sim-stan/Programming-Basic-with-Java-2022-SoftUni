import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //•	Видеокарта – 250 лв./бр.
        //•	Процесор – 35% от цената на закупените видеокарти/бр.
        //•	Рам памет – 10% от цената на закупените видеокарти/бр.



        double budget = Double.parseDouble(scanner.nextLine());
        int videoAmount = Integer.parseInt(scanner.nextLine());
        int processorsAmount = Integer.parseInt(scanner.nextLine());
        int ramAmount = Integer.parseInt(scanner.nextLine());

        double videoPrice = videoAmount * 250;
        double processorPrice =processorsAmount*( videoPrice * 0.35);
        double ramPrice = ramAmount* (videoPrice * 0.10);

        double totalPrice = videoPrice + processorPrice + ramPrice ;


        if (videoAmount > processorsAmount) {

            totalPrice = totalPrice * 0.85;

        }

            double diff = Math.abs(budget - totalPrice);

        if (totalPrice <= budget) {

            System.out.printf("You have %.2f leva left!",diff);

        } else

            System.out.printf("Not enough money! You need %.2f leva more!", diff);






    }
}
