package ExamSIXandSEVENofJuly;

import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class Coffee_Machine_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String drink = scanner.nextLine();
        String sugar = scanner.nextLine();
        int drinksCount = Integer.parseInt(scanner.nextLine());

        double lastprie=0.0;


        if (drink.equals("Espresso")) {

            switch (sugar) {

                case "Without":
                lastprie=(drinksCount * 0.90) * 0.65;
                if (drinksCount>=5){
                    lastprie=lastprie*0.75;
                }
                if (lastprie>15){
                    lastprie=lastprie*0.8;
                }

                    break;

                case "Normal":
                    lastprie=(drinksCount * 1.00);

                    if (drinksCount>=5) {
                        lastprie = lastprie * 0.75;
                    }if (lastprie>15) {
                    lastprie = lastprie * 0.8;
                }
                        break;

                case "Extra":
                    lastprie=(drinksCount * 1.20);
                    if (drinksCount>=5) {
                        lastprie = lastprie * 0.75;
                    }if (lastprie>15) {
                    lastprie = lastprie * 0.8;
                }
                    break;

            }
        }else if (drink.equals("Cappuccino")) {

            switch (sugar) {

                case "Without":
                lastprie=(drinksCount*1.00)*0.65;
                if (lastprie>15){
                    lastprie=lastprie*0.8;
                }

                    break;

                case "Normal":

                    lastprie=(drinksCount*1.20);
                    if (lastprie>15) {
                        lastprie = lastprie * 0.8;
                    }
                    break;

                case "Extra":

                    lastprie=(drinksCount*1.60);
                    if (lastprie>15) {
                        lastprie = lastprie * 0.8;
                    }
                    break;
            }
        }else if (drink.equals("Tea")) {

            switch (sugar) {

                case "Without":
              lastprie=(drinksCount*0.5) * 0.65;
                if (lastprie>15){
                 lastprie=lastprie*0.2;
                }
                    break;

                case "Normal":
                    lastprie=drinksCount*0.6;
                    if (lastprie>15){
                        lastprie=lastprie*0.2;
                    }

                    break;

                case "Extra":
                    lastprie=drinksCount*0.7;
                    if (lastprie>15){
                        lastprie=lastprie*0.2;
                    }

                    break;
            }
        }
        System.out.printf("You bought %d cups of %s for %.2f lv.",drinksCount,drink,lastprie);
    }
}
