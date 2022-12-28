package Dopulnitelni_Zadachi___;

import java.util.Scanner;

public class bilet_za_kino_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        String command= scanner.nextLine();
        int totalTickets=0;
        int studentCount = 0;
        int standardCount = 0;
        int kidCount = 0;


        while (!command.equals("Finish")) {

            String movieName = command;
            int seats = Integer.parseInt(scanner.nextLine());

            String kindofTicket = scanner.nextLine();
            int soldtickets=0;


            while (!kindofTicket.equals("End")) {
                totalTickets++;
                soldtickets++;


                if (kindofTicket.equals("student")) {
                    studentCount++;

                } else if (kindofTicket.equals("standard")) {
                    standardCount++;

                } else if (kindofTicket.equals("kid")) {
                    kidCount++;
                }
                if (soldtickets >= seats ) {
                    break;
                }
                kindofTicket = scanner.nextLine();
            }



            System.out.printf("%s - %.2f%% full.%n",movieName,1.0*soldtickets/seats*100);

            command = scanner.nextLine();

        }
        System.out.printf("Total tickets: %d.%n",totalTickets);
        System.out.printf("%.2f%% student tickets.%n",1.0* studentCount/totalTickets*100);
        System.out.printf("%.2f%% standard tickets.%n",1.0* standardCount/totalTickets*100);
        System.out.printf("%.2f%% kids tickets.",1.0 * kidCount/totalTickets * 100);
    }
}