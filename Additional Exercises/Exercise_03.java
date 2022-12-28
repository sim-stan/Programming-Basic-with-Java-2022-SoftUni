package Dopulnitelni_Zadachi___;

import java.util.Scanner;

public class Exercise_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double moneySheHave = Double.parseDouble(scanner.nextLine());

        String comand = scanner.nextLine();
        int daysCount = 0;
        int daysSpend = 0;



        while (budget > moneySheHave) {

            String saveprspend = comand;

            double amount = Double.parseDouble(scanner.nextLine());

            daysCount++;

            if (saveprspend.equals("save")) {

                daysSpend=0;
                moneySheHave += amount;


            } else if (saveprspend.equals("spend")) {

                daysSpend++;
                moneySheHave -= amount;


                if (moneySheHave < amount) {

                    moneySheHave = 0;

                }


            } if (moneySheHave>budget) {
                break;
            }

            if (daysSpend ==5) {
                break;
            }




            saveprspend = scanner.nextLine();
        }

            if (moneySheHave>=budget) {
                System.out.printf("You saved the money for %d days.", daysCount);

            } else {
                System.out.printf("You can't save the money.%n%d", daysCount);
            }

        }
    }

