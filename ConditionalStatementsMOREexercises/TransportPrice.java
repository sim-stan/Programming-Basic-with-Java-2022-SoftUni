package ConditionalStatementsMOREexercises;

import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        //•	Такси. Начална такса: 0.70 лв. Дневна тарифа: 0.79 лв. / км. Нощна тарифа: 0.90 лв. / км.
        //•	Автобус. Дневна / нощна тарифа: 0.09 лв. / км. Може да се използва за разстояния минимум 20 км.
        //•	Влак. Дневна / нощна тарифа: 0.06 лв. / км. Може да се използва за разстояния минимум 100 км.


        int km = Integer.parseInt(scanner.nextLine());

        String timeoftheday = scanner.nextLine();


        double taxidayrate = 0.70 + km * 0.79;
        double taxinightrate = 0.70 + km * 0.90;

        double busdayrate = km * 0.09;

        double traindrate = km * 0.06;

        double price = 0.0;

        if (timeoftheday.equals("day")) {
            if (km<20) {
               price= taxidayrate;
            } else if (km>20 && km<100) {
                price = busdayrate;

            }else if (km>100) {
                price = traindrate;
            }

        } else if (timeoftheday.equals("night")) {

            if (km<20) {
                price= taxinightrate;

            } else if (km>20 && km<100) {
                price = busdayrate;

            }else if (km>100) {
                price = traindrate;
            }


        }

        System.out.printf("%.2f",price);
    }

}

