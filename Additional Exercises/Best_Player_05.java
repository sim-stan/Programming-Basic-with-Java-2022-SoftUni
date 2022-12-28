package Dopulnitelni_Zadachi___;

import java.util.Scanner;

public class Best_Player_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int mostgoals = 0;
        String bestplayer = "";

        while (!input.equals("END")) {

            int goals = Integer.parseInt(scanner.nextLine());

            if (goals>mostgoals) {
                bestplayer = input;
                mostgoals = goals;

                if (mostgoals>=10) {
                    break;
                }
            }

            input = scanner.nextLine();

        }

        System.out.printf("%s is the best player!%n",bestplayer);
        if (mostgoals>=3){
            System.out.printf("He has scored %d goals and made a hat-trick !!!",mostgoals);

        }else {
            System.out.printf("He has scored %d goals.",mostgoals);
        }
    }
}
