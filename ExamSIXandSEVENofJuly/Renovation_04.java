package ExamSIXandSEVENofJuly;

import java.util.Scanner;

public class Renovation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int visochina = Integer.parseInt(scanner.nextLine());
        int shirochina = Integer.parseInt(scanner.nextLine());
        int percentdontneedPAint = Integer.parseInt(scanner.nextLine());

        String command= scanner.nextLine();

        double painleft=0;
        int totalarea=shirochina*visochina*4;
        double areatobePainted=Math.ceil(totalarea-(1.0*totalarea*(1.0*percentdontneedPAint/100)));

        while (!command.equals("Tired!")) {


           double litersPaint = Double.parseDouble(command);

           areatobePainted-=litersPaint;

            painleft=areatobePainted;


            if (areatobePainted<=0){
                break;


            }
            command= scanner.nextLine();
        }


        if (command.equals("Tired!")){
            System.out.printf("%d quadratic m left.",(int)areatobePainted);

        }else if (painleft==0) {
        System.out.print("All walls are painted! Great job, Pesho!");

        } else {
            System.out.printf("All walls are painted and you have %d l paint left!",Math.abs((int)painleft));
        }
    }
}