package ExamSIXandSEVENofJuly;

import java.util.Scanner;

public class Club_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double desireProfit = Double.parseDouble(scanner.nextLine());

        String command= scanner.nextLine();

        double sales=0.0;
        double currentPrice=0.0;


        while (!command.equals("Party!")) {
            int coctailCount = Integer.parseInt(scanner.nextLine());
            String coctailname=command;

            int length= command.length();

            currentPrice=length * coctailCount;

            if (currentPrice%2!=0){
                currentPrice=currentPrice*0.75;
            }
            sales+=currentPrice;

            if (sales>=desireProfit){
                break;
            }



            command= scanner.nextLine();
        }
        double diff=Math.abs(desireProfit - sales);

        if (sales>=desireProfit){
            System.out.printf("Target acquired.%n");
            System.out.printf("Club income - %.2f leva.",sales);
        }else {
            System.out.printf("We need %.2f leva more.%n",diff);
            System.out.printf("Club income - %.2f leva.",sales);
        }

    }
}
