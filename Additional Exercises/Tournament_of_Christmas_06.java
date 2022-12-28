package Dopulnitelni_Zadachi___;

import java.util.Scanner;

public class Tournament_of_Christmas_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());


        double total = 0;


        int daywin = 0;
        int daylose = 0;

        for (int i = 1; i <= days; i++) {
            String command = scanner.nextLine();
            double moneyfortheday = 0;
            int winCount = 0;
            int loseCount = 0;


            while (!command.equals("Finish")) {


                String sport = command;
                String result = scanner.nextLine();

                switch (result) {

                    case "win":
                        winCount++;
                        moneyfortheday += 20;
                        break;

                    case "lose":

                        loseCount++;
                        break;
                }
                command = scanner.nextLine();

                 } if (winCount > loseCount) {
                    moneyfortheday *=1.10;
                }

                 daywin+=winCount;
                 daylose+=loseCount;
                 total+=moneyfortheday;
            }

            if (daywin > daylose) {

                total *= 1.20;

                System.out.printf("You won the tournament! Total raised money: %.2f", total);
            } else {

                System.out.printf("You lost the tournament! Total raised money: %.2f", total);
            }

        }
    }
