package Dopulnitelni_Zadachi___;

import java.util.Scanner;

public class PC_Game_Shop_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soldGames = Integer.parseInt(scanner.nextLine());

        double Hearthstone = 0.0;
        double Fornite = 0.0;
        double Overwatch = 0.0;
        double Others = 0.0;




        for (int i = 0; i < soldGames; i++) {

            String name = scanner.nextLine();

            switch (name) {

                case "Hearthstone":
                    Hearthstone += 1;
                    break;


                case "Fornite":
                Fornite +=1;

                    break;


                case "Overwatch":
                Overwatch +=1;
                    break;

                case "Others":
                Others +=1;

                    break;
                default:
                    Others +=1;
                    break;
            }


        }

        double percentHearthstone = Hearthstone/soldGames*100.00;
        double percentFornite = Fornite/soldGames * 100.00;
        double percentOverwatch = Overwatch/soldGames*100.00;
        double percentOthers= Others/soldGames * 100.00;

        System.out.printf("Hearthstone - %.2f%%%n",percentHearthstone);
        System.out.printf("Fornite - %.2f%%%n",percentFornite);
        System.out.printf("Overwatch - %.2f%%%n",percentOverwatch);
        System.out.printf("Others - %.2f%%",percentOthers);


    }
}
