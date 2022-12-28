package Dopulnitelni_Zadachi___;

import java.util.Scanner;

public class Movie_Ratings_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int movieCount = Integer.parseInt(scanner.nextLine());

             double mintraiting = Double.MAX_VALUE;
             double maxrating =Double.MIN_VALUE;
             double allraitings = 0.0;

             String maxratedMovie= "";
             String minratedMovie= "";

        for (int i = 1; i <=movieCount ; i++) {


            String movieName = scanner.nextLine();
            double rating =Double.parseDouble(scanner.nextLine());

           allraitings += rating;


            if (rating>maxrating){
                maxratedMovie=movieName;
                maxrating = rating;

            }else {
                minratedMovie=movieName;
                mintraiting=rating;

            }



        }
        double averagerate = allraitings/movieCount;
        System.out.printf("%s is with highest rating: %.1f%n",maxratedMovie,maxrating);
        System.out.printf("%s is with lowest rating: %.1f%n",minratedMovie,mintraiting);
        System.out.printf("Average rating: %.1f",averagerate);

    }
}
