package Dopulnitelni_Zadachi___;

import java.util.Scanner;

public class Oscars_week_in_cinema_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        String typeRoom = scanner.nextLine();
        int ticketsCount = Integer.parseInt(scanner.nextLine());

        double totalrevenue = 0.0;
        
        
        switch (movieName) {

            case "A Star Is Born":
                
                
                if (typeRoom.equals("normal")){
                    totalrevenue = ticketsCount * 7.5;
                } else if (typeRoom.equals("luxury")) {
                    totalrevenue = ticketsCount * 10.5;
                } else if (typeRoom.equals("ultra luxury")) {
                    totalrevenue = ticketsCount * 13.5;
                }


                break;

            case "Bohemian Rhapsody":

                if (typeRoom.equals("normal")){
                    totalrevenue = ticketsCount * 7.35;
                } else if (typeRoom.equals("luxury")) {
                    totalrevenue = ticketsCount * 9.45;
                } else if (typeRoom.equals("ultra luxury")) {
                    totalrevenue = ticketsCount * 12.75;
                }

                break;

            case "Green Book":

                if (typeRoom.equals("normal")){
                    totalrevenue = ticketsCount * 8.15;
                } else if (typeRoom.equals("luxury")) {
                    totalrevenue = ticketsCount * 10.25;
                } else if (typeRoom.equals("ultra luxury")) {
                    totalrevenue = ticketsCount * 13.25;
                }


                break;


            case "The Favourite":

                if (typeRoom.equals("normal")){
                    totalrevenue = ticketsCount * 8.75;
                } else if (typeRoom.equals("luxury")) {
                    totalrevenue = ticketsCount * 11.55;
                } else if (typeRoom.equals("ultra luxury")) {
                    totalrevenue = ticketsCount * 13.95;
                }
                
                
                break;


        }

        System.out.printf("%s -> %.2f lv.",movieName,totalrevenue);

    }
}
