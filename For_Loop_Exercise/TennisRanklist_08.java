package For_Loop_Exercise;

import java.util.Scanner;

public class TennisRanklist_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournamentsCount = Integer.parseInt(scanner.nextLine());
        int startPoints = Integer.parseInt(scanner.nextLine());

        int tournamentpoints = 0;
        int winsCount = 0;


        for (int i = 1; i <=tournamentsCount ; i++) {

            String result = scanner.nextLine();

            switch (result) {

                case "W":
                winsCount ++;
                tournamentpoints +=2000;
                break;
                case "F":
                    tournamentpoints +=1200;
                    break;
                case "SF":
                    tournamentpoints += 720;
                    break;

            }


        }

        int allpoints = startPoints + tournamentpoints;
       int averagepoints =  tournamentpoints/tournamentsCount;
        double percentwins= 1.0 * winsCount/ tournamentsCount * 100;

        System.out.printf("Final points: %d%n",allpoints);
        System.out.printf("Average points: %d%n",averagepoints);
        System.out.printf("%.2f%%",percentwins);
    }
}
