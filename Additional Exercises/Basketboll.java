package Dopulnitelni_Zadachi___;

import java.util.Scanner;

public class Basketboll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        String command= scanner.nextLine();

        int gamesCount=0;
        int desiwinCount=0;
        int otherwinCount=0;

        while (!command.equals("End of tournaments")) {
            String nameofTournament= command;
            int numofGames = Integer.parseInt(scanner.nextLine());

            int diffpoints=0;

            for (int i = 1; i <=numofGames; i++) {
                    gamesCount++;
                int desiResult = Integer.parseInt(scanner.nextLine());
                int otherresult = Integer.parseInt(scanner.nextLine());

                if (desiResult>otherresult) {
                    desiwinCount++;
                    diffpoints=(desiResult-otherresult);
                } else {
                    otherwinCount++;
                    diffpoints=otherresult-desiResult;

                }
                    if (desiResult>otherresult) {
                        System.out.printf("Game %d of tournament %s: win with %d points.%n", i, command, diffpoints);
                    }else {
                        System.out.printf("Game %d of tournament %s: lost with %d points.%n",i,command,diffpoints);
                    }
            }

            command= scanner.nextLine();
        }

        double avgWin=1.0*desiwinCount/gamesCount *100;
        double avgLost=1.0* otherwinCount/gamesCount*100;

        System.out.printf("%.2f%% matches win%n",avgWin);
        System.out.printf("%.2f%% matches lost",avgLost);
    }
}
