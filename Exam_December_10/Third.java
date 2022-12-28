package Exam_December_10;

import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int pplAmount = Integer.parseInt(scanner.nextLine());
        String season= scanner.nextLine();
        double price=0.0;

        switch (season){

            case "spring":
              if (pplAmount<=5) {
                  price=pplAmount*50;
              }else {
                  price=pplAmount*48;
              }

                break;

            case "summer":
                if (pplAmount<=5) {
                    price=pplAmount*48.5;
                    price=price*0.85;
                }else {
                    price=pplAmount*45;
                    price=price*0.85;
                }


                break;

            case "autumn":

                if (pplAmount<=5) {
                    price=pplAmount*60;
                }else {
                    price=pplAmount*49.50;
                }

                break;

            case "winter":

                if (pplAmount<=5) {
                    price=pplAmount*86;
                    price=price*1.08;
                }else {
                    price=pplAmount*85;
                    price=price * 1.08;
                }

                break;
        }
        System.out.printf("%.2f leva.",price);
    }
}
