package Dopulnitelni_Zadachi___;

import java.util.Scanner;

public class Oscar_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String actorName= scanner.nextLine();
        double pointsFromAcademy = Double.parseDouble(scanner.nextLine());
        int juryCount = Integer.parseInt(scanner.nextLine());
        double totalpoints=pointsFromAcademy;


        for (int i = 1; i <=juryCount ; i++) {

            String juryName= scanner.nextLine();
            double pointsFromJury = Double.parseDouble(scanner.nextLine());
            double currentpoints=0.0;

            int points=juryName.length();

            currentpoints=points*pointsFromJury/2;
            totalpoints=totalpoints+currentpoints;

            if (totalpoints>=1250.5) {
                break;
            }
        }
        if (totalpoints>=1250.5){
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!",actorName,totalpoints);
        }else {
            double diff=Math.abs(1250.5-totalpoints);
            System.out.printf("Sorry, %s you need %.1f more!", actorName, diff);
        }
    }
}
