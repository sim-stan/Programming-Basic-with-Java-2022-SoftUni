package Dopulnitelni_Zadachi___;

import java.util.Scanner;

public class Filmov_raiting_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numOfMovies = Integer.parseInt(scanner.nextLine());
        double highRating=Double.MIN_VALUE;
        double lowestRating=Double.MAX_VALUE;
        String highrateMovie="";
        String lowrateMovie="";
        double totalRating=0.0;

        for (int i = 0; i <numOfMovies ; i++) {

            String movieName= scanner.nextLine();
            double rating = Double.parseDouble(scanner.nextLine());

            totalRating= totalRating + rating;


            if (rating>=highRating){
                highRating=rating;
                highrateMovie=movieName;
            }else {
                lowestRating=rating;
                lowrateMovie=movieName;
            }

        }
        double avgrating= totalRating/numOfMovies;
        System.out.printf("%s is with highest rating: %.1f%n",highrateMovie,highRating);
        System.out.printf("%s is with lowest rating: %.1f%n",lowrateMovie,lowestRating);
        System.out.printf("Average rating: %.1f",avgrating);

    }
}
