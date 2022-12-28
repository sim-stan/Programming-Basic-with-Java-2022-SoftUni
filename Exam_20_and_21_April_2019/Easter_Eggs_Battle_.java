package Exam_20_and_21_April_2019;

import java.util.Scanner;

public class Easter_Eggs_Battle_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int player1Eggs = Integer.parseInt(scanner.nextLine());
        int player2Eggs = Integer.parseInt(scanner.nextLine());

        String command= scanner.nextLine();

       // int player1result=player1Eggs;
      //  int player2result=player2Eggs;

        while (!command.equals("End")){

            String result=command;


            switch (result) {

                case "one":
               // player1Eggs++;
                player2Eggs--;


                    break;

                case "two":
                player1Eggs--;
              //  player2Eggs++;
                    break;

            }

            if (player1Eggs==0 || player2Eggs== 0){

                break;
            }



            command= scanner.nextLine();
        }

            if (player1Eggs==0){
                System.out.printf("Player one is out of eggs. Player two has %d eggs left.%n",player2Eggs);
            } else if (player2Eggs==0) {
                System.out.printf("Player two is out of eggs. Player one has %d eggs left.",player1Eggs);
            } else if (command.equals("End")) {
                System.out.printf("Player one has %d eggs left.%n",player1Eggs);
                System.out.printf("Player two has %d eggs left.",player2Eggs);
            }


    }
}
