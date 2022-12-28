package Dopulnitelni_Zadachi___;

import java.util.Scanner;

public class Pochivka_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double moneySheHave = Double.parseDouble(scanner.nextLine());

        String command = scanner.nextLine();
        double total = 0;
        int daysspend = 0;
        int totaldays = 0;


            while (budget>moneySheHave) {
                String spendORsave = command;
                double amount = Double.parseDouble(scanner.nextLine());

                    totaldays++;


                if (spendORsave.equals("spend")) {
                    daysspend ++;
                    moneySheHave = moneySheHave - amount;

                    if (moneySheHave<0){
                        moneySheHave=0;
                    }
                }if (spendORsave.equals("save")) {

                    daysspend = 0;
                    moneySheHave = moneySheHave + amount;
                }
                if (moneySheHave>=budget) {
                    break;
                }
                if (daysspend==5){
                    break;
                }
                command= scanner.nextLine();
            }

            if (moneySheHave>=budget){
                System.out.printf("You saved the money for %d days.",totaldays);

            }else {
                System.out.printf("You can't save the money.%n%d",daysspend);
            }
    }
}
