package Dopulnitelni_Zadachi___;

import java.util.Scanner;

public class Parking_Happy_Cat_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());


        double totalparking=0.0;

        for (int i = 1; i <=days; i++) {

            double dayparkingSUM=0.0;

            for (int j = 1; j <=hours; j++) {


                if (i%2==0 && j%2!=0) {
                    dayparkingSUM=dayparkingSUM+2.50;
                    
                } else if (i%2!=0 && j%2==0) {
                    dayparkingSUM = dayparkingSUM +1.25;
                }else {
                    dayparkingSUM= dayparkingSUM+1.00;
                }

            }
            System.out.printf("Day: %d - %.2f leva%n",i,dayparkingSUM);

            totalparking=totalparking+dayparkingSUM;

        }
        System.out.printf("Total: %.2f leva",totalparking);
    }
}
