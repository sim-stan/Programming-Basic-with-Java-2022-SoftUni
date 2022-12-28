package Exam_march_28_29_2020;

import java.util.Scanner;

public class Energy_Booster_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flavor= scanner.nextLine();
        String sizeofPackage= scanner.nextLine();
        int amountPackages = Integer.parseInt(scanner.nextLine());

        double price=0.0;

        if (sizeofPackage.equals("small")){

            switch (flavor){

                case "Watermelon":
                price=2*56 * amountPackages;
                    break;

                case "Mango":
                    price=2*36.66 * amountPackages;
                    break;

                case "Pineapple":
                    price=2*42.10 * amountPackages;
                    break;

                case "Raspberry":
                    price=2*20 * amountPackages;
                    break;
            }
                if (price>=400 && price<=1000) {
                    price=price * 0.85;
                } else if (price>1000) {
                    price=price/2;
                }


        } else if (sizeofPackage.equals("big")) {

            switch (flavor){

                case "Watermelon":
                    price=5*28.70 * amountPackages;
                    break;

                case "Mango":
                    price=5*19.60 * amountPackages;
                    break;

                case "Pineapple":
                    price=5*24.80 * amountPackages;
                    break;

                case "Raspberry":
                    price=5*15.20 * amountPackages;
                    break;
            }
            if (price>=400 && price<=1000) {
                price=price * 0.85;
            } else if (price>1000) {
                price=price/2;
            }

        }
        System.out.printf("%.2f lv.",price);

    }
}
