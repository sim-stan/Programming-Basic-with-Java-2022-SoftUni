package ExamSIXandSEVENofJuly;

import java.util.Scanner;

public class PC_Game_SHOP_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int gamesSold = Integer.parseInt(scanner.nextLine());




       int overwatchcount=0;
       int hearthstonecount=0;
       int fornitecount=0;
       int otherscount=0;

        for (int i = 1; i <=gamesSold ; i++) {

            String gamename= scanner.nextLine();

            switch (gamename) {

                case "Hearthstone":

                    hearthstonecount++;

                    break;

                case "Fornite":
                    fornitecount++;
                    break;

                case "Overwatch":
                    overwatchcount++;
                    break;

                default:
                    otherscount++;
                    break;


            }

        }

        double overwatch=1.0*overwatchcount/gamesSold*100.00;
        double others=1.0*otherscount/gamesSold*100.00;
        double fornite=1.0*fornitecount/gamesSold*100.00;
        double hearthstone=1.0*hearthstonecount/gamesSold*100.00;


        System.out.printf("Hearthstone - %.2f%%%n",hearthstone);
        System.out.printf("Fornite - %.2f%%%n",fornite);
        System.out.printf("Overwatch - %.2f%%%n",overwatch);
        System.out.printf("Others - %.2f%%",others);

    }
}
