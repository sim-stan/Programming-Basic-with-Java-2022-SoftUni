package While_Loop_Exercise;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double moneyNeedforvacation = Double.parseDouble(scanner.nextLine());
        double moneySHEhave= Double.parseDouble(scanner.nextLine());

        String spendORsave = scanner.nextLine();

        int dayspendinaROW= 0;
        int totaldays=0;

        while (moneySHEhave<moneyNeedforvacation) {
            String operator = spendORsave;
            double amount = Double.parseDouble(scanner.nextLine());
                totaldays ++;

            if (operator.equals("spend")) {
                dayspendinaROW ++;
                moneySHEhave = moneySHEhave - amount;

                if (moneySHEhave<0) {
                    moneySHEhave = 0;
                }

            } else if (operator.equals("save")) {

                moneySHEhave = moneySHEhave + amount;
                dayspendinaROW = 0;

            }
            if (moneySHEhave>=moneyNeedforvacation) {
                break;
            }


                if (dayspendinaROW == 5) {
                    break;
                }


            spendORsave = scanner.nextLine();
        }
        if (moneySHEhave>=moneyNeedforvacation) {

            System.out.printf("You saved the money for %d days.", totaldays);


        }else {
            System.out.printf("You can't save the money.%n%d",totaldays);


        }
    }
}

