package Dopulnitelni_Zadachi___;

import java.util.Scanner;

public class Balls_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int red =0;
        int orange =0;
        int yellow =0;
        int white =0;
        int black =0;
        int other =0;
        int totalpoints=0;




        for (int i = 0; i < number; i++) {

            String color = scanner.nextLine();

            switch (color) {
                case "red":
                    red +=1;
                    totalpoints +=5;
                    break;

                case "orange":
                    orange +=1;
                totalpoints +=10;
                    break;

                case "yellow":
                    yellow +=1;
                    totalpoints +=15;
                    break;

                case "white":
                    white +=1;
                    totalpoints +=20;
                    break;

                case "black":
                    black +=1;
                    totalpoints =totalpoints/2;
                    break;
                default:
                    other +=1;
            }

        }
        System.out.printf("Total points: %d%n",totalpoints);
        System.out.printf("Red balls: %d%n",red);
        System.out.printf("Orange balls: %d%n",orange);
        System.out.printf("Yellow balls: %d%n",yellow);
        System.out.printf("White balls: %d%n",white);
        System.out.printf("Other colors picked: %d%n",other);
        System.out.printf("Divides from black balls: %d%n",black);




    }
}
