package ConditionalStatementsMOREexercises;

import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int poolObem = Integer.parseInt(scanner.nextLine());
        int pipe1 = Integer.parseInt(scanner.nextLine());
        int pipe2 = Integer.parseInt(scanner.nextLine());
        double hourseHeleft = Double.parseDouble(scanner.nextLine());


        double totalpipe2 = hourseHeleft * pipe1;
        double totalpipe1 = hourseHeleft * pipe2;

        double totalpipes = totalpipe1 + totalpipe2;

        double overflow = totalpipes - poolObem;

        double pipe1diff = totalpipes - totalpipe1;
        double pipe2diff = totalpipes - totalpipe2;

        double percentpipetotal = Math.abs((totalpipes / poolObem) * 100);

        double percentpipe1 = (pipe1diff / totalpipes) * 100;
        double percentpipe2 = (pipe2diff / totalpipes) * 100;

        char percent= '%';

        if (totalpipes <= poolObem) {


            System.out.printf("The pool is %.2f%c full. Pipe 1: %.2f%c. Pipe 2: %.2f%c.", percentpipetotal,percent, percentpipe1,percent, percentpipe2, percent);

        } else


            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", hourseHeleft, overflow);


        }
    }
