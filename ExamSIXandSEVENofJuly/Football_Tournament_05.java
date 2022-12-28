package ExamSIXandSEVENofJuly;

import java.util.Scanner;

public class Football_Tournament_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // W - Отборът е победител и получава 3 точки
        // D - Срещата е завършила без победител и отборът получава 1 точка
        // L - Отборът е загубил срещата и не получава точки

            String teamName= scanner.nextLine();
            int gamesCount = Integer.parseInt(scanner.nextLine());


            int totalPoints=0;
            int wCount=0;
            int dCount=0;
            int lCount=0;
            double winRate=0.0;

        for (int i = 0; i <gamesCount ; i++) {
            String symbol= scanner.nextLine();


            if (gamesCount == 0){
                break;
            }

            switch (symbol){

                case "W":
                    totalPoints+=3;
                    wCount++;
                    break;
                case "D":
                totalPoints+=1;
                    dCount++;
                    break;
                case "L":

                    lCount++;
                    break;
            }

        }
        winRate=1.0*wCount/gamesCount *100.00;
        if (gamesCount == 0) {
            System.out.printf("%s hasn't played any games during this season.", teamName);

        } else{
            System.out.printf("%s has won %d points during this season.%n",teamName,totalPoints);
            System.out.printf("Total stats:%n");
            System.out.printf("## W: %d%n",wCount);
            System.out.printf("## D: %d%n",dCount);
            System.out.printf("## L: %d%n",lCount);
            System.out.printf("Win rate: %.2f%%",winRate);
        }

    }
}
