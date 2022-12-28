package Exam_20_and_21_April_2019;

import java.util.Scanner;

public class Easter_Lunch_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kozunak = Integer.parseInt(scanner.nextLine());
        int eggs = Integer.parseInt(scanner.nextLine());
        int kurabii = Integer.parseInt(scanner.nextLine());

        double eggspaint=eggs*12*0.15;
        double eggsprice=eggs * 4.35;
        double kurabiikiprice= kurabii*5.4;
        double kozunatsiprice= kozunak*3.2;

        double total= eggsprice + eggspaint + kurabiikiprice+ kozunatsiprice;

        System.out.printf("%.2f",total);

    }
}
