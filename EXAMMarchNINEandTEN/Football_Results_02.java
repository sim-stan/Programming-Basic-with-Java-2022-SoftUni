package EXAMMarchNINEandTEN;

import java.util.Scanner;

public class Football_Results_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String result1= scanner.nextLine();
        String result2= scanner.nextLine();
        String result3= scanner.nextLine();



        char number1= result1.charAt(0);
        char number2=result1.charAt(2);

        char number3=result2.charAt(0);
        char number4=result2.charAt(2);

        char number5=result3.charAt(0);
        char number6=result3.charAt(2);

        int wins=0;
        int lost=0;
        int draw=0;

        if (number1>number2){
            wins++;
        }else if (number1<number2){
            lost++;
        } else  {
            draw++;
        }

        if (number3>number4){
            wins++;
        }else if (number3<number4){
            lost++;
        } else  {
            draw++;
        }
        if (number5>number6){
            wins++;
        }else if (number5<number6){
            lost++;
        } else  {
            draw++;
        }

        System.out.printf("Team won %d games.%n",wins);
        System.out.printf("Team lost %d games.%n",lost);
        System.out.printf("Drawn games: %d",draw);
    }
}
