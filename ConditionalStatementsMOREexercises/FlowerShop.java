package ConditionalStatementsMOREexercises;

import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        //•	Магнолии – 3.25 лева
        //•	Зюмбюли – 4 лева
        //•	Рози – 3.50 лева
        //•	Кактуси – 8 лева
        //От общата сума, Мария трябва да плати 5% данъци.


        int amountMagnolii = Integer.parseInt(scanner.nextLine());
        int amountZiumbiuli = Integer.parseInt(scanner.nextLine());
        int amountRozi = Integer.parseInt(scanner.nextLine());
        int amountKaktus = Integer.parseInt(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());


        double totalflowers = (amountMagnolii * 3.25) + (amountZiumbiuli * 4.00) + (amountRozi * 3.50) + (amountKaktus * 8.00);

        double totalAftertaxes = totalflowers * 0.95;

        double diff = Math.abs(giftPrice - totalAftertaxes);

        if (totalAftertaxes >= giftPrice) {

            diff = Math.floor(diff);

            System.out.printf("She is left with %.0f leva.", diff);

        } else {

            diff = Math.ceil(diff);

            System.out.printf("She will have to borrow %.0f leva.",diff);
        }


    }
}
