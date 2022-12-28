package Exam_20_and_21_April_2019;

import java.util.Scanner;

public class Easter_Eggs_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            int n = Integer.parseInt(scanner.nextLine());



            int red=0;
            int orange=0;
            int blue=0;
            int green=0;
            int max=Integer.MIN_VALUE;
            String colormax="red";


        for (int i = 1; i <=n ; i++) {

            String color= scanner.nextLine();


            switch (color){

                case "red":
                    red++;

                    break;

                case "orange":
                    orange++;

                    break;

                case "blue":
                blue++;

                    break;

                case "green":
                green++;
                    break;

            }



        }

        if (red>green && red>orange && red>blue){
            max=red;
            colormax="red";
        }else if (orange>red && orange>green && orange>blue){
            max=orange;
            colormax="orange";
        } else if (blue>orange && blue>red && blue>green) {
            max=blue;
            colormax="blue";
        } else if (green>orange && green>blue && green>red) {
            max=green;
            colormax="green";
        }

        System.out.printf("Red eggs: %d%n",red);
        System.out.printf("Orange eggs: %d%n",orange);
        System.out.printf("Blue eggs: %d%n",blue);
        System.out.printf("Green eggs: %d%n",green);
        System.out.printf("Max eggs: %d -> %s",max,colormax);
    }
}
