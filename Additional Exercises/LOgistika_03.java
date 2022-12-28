package Dopulnitelni_Zadachi___;

import java.util.Scanner;

public class LOgistika_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int cargoCount = Integer.parseInt(scanner.nextLine());
        int vanCount=0;
        int truckCount=0;
        int trainCount=0;
        double cargoSum=0;
        double vanPrice=0;
        double truckPrice=0;
        double trainPrice=0;
        double totalPrice=0;

        for (int i = 1; i <=cargoCount ; i++) {

            int cargoWeight = Integer.parseInt(scanner.nextLine());

            cargoSum+=cargoWeight;


            if (cargoWeight<=3) {
                vanCount+=cargoWeight;
                vanPrice+=cargoWeight*200;

            } else if (cargoWeight>4 && cargoWeight<=11) {
                truckCount+=cargoWeight;
                truckPrice+=cargoWeight*175;

            } else if (cargoWeight>=12) {
                trainCount+=cargoWeight;
                truckPrice+=cargoWeight*120;

            }
                totalPrice= trainPrice+truckPrice+vanPrice;

        }

        double avgPrice=totalPrice/cargoSum;
        double avgVan=vanCount/cargoSum *100.00;
        double avgtruck=truckCount/cargoSum *100.00;
        double avgtrain=trainCount/cargoSum *100.00;
        System.out.printf("%.2f%n",avgPrice);
        System.out.printf("%.2f%%%n",avgVan);
        System.out.printf("%.2f%%%n",avgtruck);
        System.out.printf("%.2f%%",avgtrain);

    }
}
