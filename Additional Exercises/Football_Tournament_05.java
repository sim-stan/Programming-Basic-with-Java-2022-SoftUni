package Dopulnitelni_Zadachi___;

import java.util.Scanner;

public class Football_Tournament_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String teamName = scanner.nextLine();
        int games = Integer.parseInt(scanner.nextLine());


        int w = 0;
        int d = 0;
        int l = 0;
        double winRate = 0.0;


        for (int i = 0; i <games; i++) {

            String result = scanner.nextLine();

            switch (result) {


                case "W":

                w+= 1;


                    break;

                case "D":
                    d +=1;


                    break;

                case "L":

                    l+=1;

                    break;


            }

        }


        winRate =1.00* w/games*100.00;

        int totalpoints = (w * 3)+d;


        if (games == 0.0) {
            System.out.printf("%s hasn't played any games during this season.", teamName);
        } else {
            System.out.printf("%s has won %d points during this season%n",teamName,totalpoints);
            System.out.printf("Total stats:%n");
            System.out.printf("## W: %d%n",w);
            System.out.printf("## D: %d%n",d);
            System.out.printf("## L: %d%n",l);
            System.out.printf("Win rate: %.2f%%",winRate);



        }


    }
}