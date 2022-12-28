package Exam2_3_may;

import java.util.Scanner;

public class Tourist_Shop_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double budget = Double.parseDouble(scanner.nextLine());

        String command= scanner.nextLine();

        double currentprice=0.0;
        int productCount=0;
        double totalExpense=0.0;

        while (!command.equals("Stop")) {

            String productName=command;
            double price = Double.parseDouble(scanner.nextLine());
            productCount++;
            currentprice=price;

            if (budget<currentprice){

                break;
            }


            if (productCount%3==0){
                currentprice=price/2;
                budget=budget-currentprice;
                totalExpense+=currentprice;
            }else {
                budget=budget-currentprice;
                totalExpense+=currentprice;
            }

            command= scanner.nextLine();
        }
        if (budget<currentprice){
            double diff = Math.abs(currentprice-budget);
            System.out.printf("You don't have enough money!%n");
            System.out.printf("You need %.2f leva!",diff);

        }else {

            System.out.printf("You bought %d products for %.2f leva.",productCount,totalExpense);
        }

    }
}
