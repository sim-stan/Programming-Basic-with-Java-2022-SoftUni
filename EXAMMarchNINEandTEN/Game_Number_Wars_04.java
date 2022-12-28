package EXAMMarchNINEandTEN;

import java.util.Scanner;

public class Game_Number_Wars_04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String player1 = scanner.nextLine();
        String player2 = scanner.nextLine();

      String command = scanner.nextLine();

        int resultplayer1 = 0;
        int resultplayer2 = 0;
        int numberWar = 0;

        while (!command.equals("End of game")) {


            int player1Card = Integer.parseInt(command);
            int player2Card = Integer.parseInt(scanner.nextLine());


            if (player1Card > player2Card) {
                if (numberWar >= 1) {
                    System.out.printf("%s is winner with %d points",player1,resultplayer1);
                    break;
                }


                resultplayer1 += player1Card - player2Card;

            } else if (player2Card > player1Card) {
                if (numberWar >= 1) {
                    System.out.printf("%s is winner with %d points",player2,resultplayer2);
                    break;
                }
                resultplayer2 += player2Card - player1Card;



            } else {

                    System.out.printf("Number wars!%n");
                    numberWar++;
                }

              command = scanner.nextLine();
            }


             if (command.equals("End of game")){
             System.out.printf("%s has %d points%n",player1,resultplayer1);
             System.out.printf("%s has %d points",player2,resultplayer2);
             }
    }
}
