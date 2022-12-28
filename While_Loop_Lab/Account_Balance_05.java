package While_Loop_Lab;

import java.util.Scanner;

public class Account_Balance_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalmoney =0;

        String text = scanner.nextLine();


        while (!text.equals("NoMoreMoney")) {

            double amount = Double.parseDouble(text);

            if (amount<0) {

                System.out.println("Invalid operation!");
                break;
            }



            System.out.printf("Increase: %.2f%n",amount);

            totalmoney += amount;

            text = scanner.nextLine();
        }
        System.out.printf("Total: %.2f",totalmoney);
    }
}
