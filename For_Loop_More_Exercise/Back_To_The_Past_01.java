package For_Loop_More_Exercise;

import java.util.Scanner;

public class Back_To_The_Past_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double moneyHeHave = Double.parseDouble(scanner.nextLine());
        int yeartoLive = Integer.parseInt(scanner.nextLine());


        int years=18;

        for (int i = 1800; i <=yeartoLive; i++) {


            if (i % 2 ==0) {
                moneyHeHave-=12000;

            } else {
                moneyHeHave = moneyHeHave- (12000 + 50*(years));
            }

            years++;

        }

        double diff = Math.abs(moneyHeHave);
        if (moneyHeHave>0) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.",diff);
        }else {
            System.out.printf("He will need %.2f dollars to survive.",diff);
        }
    }
}