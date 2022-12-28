package ConditionalStatementsExercises;

import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hourse = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        minutes = minutes +15;


        if (minutes >=60) {
            hourse = hourse +1;
            minutes = minutes % 60;


        }

        if (hourse>=24){
            hourse = 0;
        }

        if (minutes<10){
            System.out.println(hourse + ":0" + minutes);


        } else
        System.out.println(hourse + ":" + minutes);


    }
}
