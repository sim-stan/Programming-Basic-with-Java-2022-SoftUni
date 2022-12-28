package Exam_march_28_29_2020;

import java.util.Scanner;

public class Trekking_Mania_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupNum = Integer.parseInt(scanner.nextLine());


        int musalaCount=0;
        int monblanCount=0;
        int kilimandjaroCount=0;
        int k2Count=0;
        int everestCount=0;
        double totalpplCount=0.0;

        for (int i = 1; i <=groupNum ; i++) {

            int pplCount = Integer.parseInt(scanner.nextLine());
            totalpplCount=totalpplCount+pplCount;

            if (pplCount<=5){
                musalaCount+=pplCount;

            } else if (pplCount<=12) {

                monblanCount+=pplCount;
            } else if (pplCount<=25) {
                kilimandjaroCount+=pplCount;

            } else if (pplCount<=40) {
                k2Count+=pplCount;
            }else {
                everestCount+=pplCount;
            }


        }
        double avgMusala=musalaCount/totalpplCount*100;
        double avgmonblan=monblanCount/totalpplCount*100;
        double avgkilimandjaro=kilimandjaroCount/totalpplCount*100;
        double avgK2=k2Count/totalpplCount*100;
        double avgEverest=everestCount/totalpplCount*100;


        System.out.printf("%.2f%%%n",avgMusala);
        System.out.printf("%.2f%%%n",avgmonblan);
        System.out.printf("%.2f%%%n",avgkilimandjaro);
        System.out.printf("%.2f%%%n",avgK2);
        System.out.printf("%.2f%%",avgEverest);

    }
}
