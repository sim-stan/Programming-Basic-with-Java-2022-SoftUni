package ExamSIXandSEVENofJuly;

import java.util.Scanner;

public class Name_Game_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name= scanner.nextLine();
        String winnerName="";

        int totalScore=0;

        String command= scanner.nextLine();

        while (!name.equals("Stop")) {
                int currentScore=0;
                String currentplayer=command;
        for (int i = 0; i <name.length() ; i++) {

            int number = Integer.parseInt(scanner.nextLine());
            int charLetter=0;


            if (charLetter==number) {
                currentScore += 10;
            }else {
                currentScore+=2;
            }
            if (currentScore>=totalScore){
                totalScore=currentScore;
                winnerName=name;
            }


        }
        command= scanner.nextLine();
        }

        System.out.printf("The winner is %s with %d points!",winnerName,totalScore);
    }
}
