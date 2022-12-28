package Exam_December_10;

import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int computers = Integer.parseInt(scanner.nextLine());

        int ratingTotal=0;
        double totalsales=0;

        for (int i = 1; i <=computers ; i++) {

        int num = Integer.parseInt(scanner.nextLine());

            double sales=0.0;
            double rating=Math.floor( num%10);
            double potentialSales=Math.floor(1.0*num/10);

          if (rating==2){
                sales=sales;

             }else if (rating==3){
                sales=potentialSales/2;

             } else if (rating==4) {
                    sales=potentialSales*0.70;
             } else if (rating==5) {
            sales=potentialSales*0.85;
             } else if (rating==6) {
            sales=potentialSales;
          }
            ratingTotal+=rating;
            totalsales=totalsales + sales;
        }
        double avg=1.0*ratingTotal/computers;

        System.out.printf("%.2f%n", totalsales);
        System.out.printf("%.2f",avg);

    }
}
