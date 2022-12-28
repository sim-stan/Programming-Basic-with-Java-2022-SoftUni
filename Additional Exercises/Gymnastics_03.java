package Dopulnitelni_Zadachi___;

import java.util.Scanner;

public class Gymnastics_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();
        String ured = scanner.nextLine();

           
            double maxpoints = 20.000;
            double hardpoint = 0.000;
            double qualitypoint = 0.000;

        switch (country){

            case "Russia":

                if (ured.equals("ribbon")){
                    
                    hardpoint = 9.100;
                    qualitypoint = 9.400;
                    
                } else if (ured.equals("hoop")) {
                    hardpoint = 9.300;
                    qualitypoint = 9.800;
                    
                } else {

                    hardpoint = 9.600;
                    qualitypoint = 9.000;
                }


                break;

            case "Bulgaria":

                if (ured.equals("ribbon")){

                    hardpoint = 9.600;
                    qualitypoint = 9.400;

                } else if (ured.equals("hoop")) {
                    hardpoint = 9.550;
                    qualitypoint = 9.750;

                } else {

                    hardpoint = 9.500;
                    qualitypoint = 9.400;
                }


                break;

            case "Italy":
                if (ured.equals("ribbon")){

                    hardpoint = 9.20;
                    qualitypoint = 9.50;

                } else if (ured.equals("hoop")) {
                    hardpoint = 9.450;
                    qualitypoint = 9.350;

                } else {

                    hardpoint = 9.700;
                    qualitypoint = 9.150;
                }



                break;





        }
        double totalpoints = hardpoint + qualitypoint;
        double diff = maxpoints - totalpoints;
        double percent = diff/maxpoints * 100;

        System.out.printf("The team of %s get %.3f on %s.%n",country,totalpoints,ured);
        System.out.printf("%.2f%%",percent);
    }
}
