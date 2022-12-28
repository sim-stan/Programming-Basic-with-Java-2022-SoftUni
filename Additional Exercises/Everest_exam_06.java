package Dopulnitelni_Zadachi___;

import java.util.Scanner;

public class Everest_exam_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command= scanner.nextLine();
        int startMeters=5364;
        int pick=8848;
        int daysCount=1;

        while (!command.equals("END")){
            String yesORno=command;
            int meters = Integer.parseInt(scanner.nextLine());

            if (yesORno.equals("Yes")){
                daysCount++;
                startMeters+=meters;

            }else {
                startMeters+=meters;

                startMeters+=meters;
            }

            if (daysCount>=5){
                break;
            }
            if (startMeters>=pick) {
                break;
            }
            command= scanner.nextLine();



        }
            if (startMeters>=pick){
            System.out.printf("Goal reached for %d",daysCount);
            }else {
                System.out.printf("Failed at %d",startMeters);
            }
    }
}
