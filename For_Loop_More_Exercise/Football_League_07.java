package For_Loop_More_Exercise;

import java.util.Scanner;

public class Football_League_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = Integer.parseInt(scanner.nextLine());
        int totalFans = Integer.parseInt(scanner.nextLine());



        double sectorA = 0.0;
        double sectorB = 0.0;
        double sectorV = 0.0;
        double sectorG = 0.0;


        for (int i = 0; i <totalFans; i++) {

            String sector = scanner.nextLine();

            switch (sector) {

                case "A":
                    sectorA += 1;

                    break;

                case "B":
                    sectorB += 1;

                    break;

                case "V":
                    sectorV += 1;

                    break;

                case"G":
                    sectorG += 1;

                    break;
            }



        }
            double sectorApercent = sectorA/totalFans * 100.00;
            double sectorBpercent = sectorB/totalFans * 100.00;
            double sectorVpercent = sectorV/totalFans * 100.00;
            double sectorGpercent = sectorG/totalFans * 100.00;

        double totalFancepercent = (1.00* totalFans/capacity) *100.00;


        System.out.printf("%.2f%%%n",sectorApercent);
        System.out.printf("%.2f%%%n",sectorBpercent);
        System.out.printf("%.2f%%%n",sectorVpercent);
        System.out.printf("%.2f%%%n",sectorGpercent);
        System.out.printf("%.2f%%",totalFancepercent);
    }
}
