package Nested_Loops_Exercise_;

import java.util.Scanner;

public class Cinema_Tickets_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        String command = scanner.nextLine();
        int totalTickets=0;
        int studentstickets=0;
        int standardTickets=0;
        int kidTickets=0;

        while (!command.equals("Finish")){
            String movieName=command;

            int seats=Integer.parseInt(scanner.nextLine());
            int soldtickets=0;

            String kindofTicket= scanner.nextLine();

            while (!kindofTicket.equals("End")) {
                soldtickets++;
                totalTickets++;
                switch (kindofTicket) {

                    case "student":
                studentstickets++;
                        break;

                    case "standard":
                        standardTickets++;
                        break;

                    case "kid":
                    kidTickets++;
                        break;
                }

                if (soldtickets>=seats){
                    break;
                }

                kindofTicket= scanner.nextLine();
            }
            double seatspercent=1.0* soldtickets/seats*100.00;

            System.out.printf("%s - %.2f%% full.%n",movieName,seatspercent);



            command= scanner.nextLine();

        }

        System.out.printf("Total tickets: %d%n",totalTickets);
        System.out.printf("%.2f%% student tickets.%n",1.0* studentstickets/totalTickets*100);
        System.out.printf("%.2f%% standard tickets.%n",1.0* standardTickets/totalTickets*100);
        System.out.printf("%.2f%% kids tickets.",1.0 * kidTickets/totalTickets * 100);



    }
}
