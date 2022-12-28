package EXAMMarchNINEandTEN;

import java.util.Scanner;

public class Darts_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String playerName= scanner.nextLine();

        int startPOints=301;
        int shootingCount=0;
        int negativeCount=0;
        String command= scanner.nextLine();

        while (!command.equals("Retire")) {

             int points = Integer.parseInt(scanner.nextLine());

             if (command.equals("Single") && startPOints>=points) {
                 startPOints -= points;
                 shootingCount++;
             }
            else  if (command.equals("Double") && startPOints>=points*2) {
                  startPOints-=points * 2;
                  shootingCount++;

             }else if (command.equals("Triple") && startPOints>=points*3) {
                 startPOints -= points * 3;
                 shootingCount++;

             }else {
                negativeCount++;
            }

            if (startPOints==0) {
                System.out.printf("%s won the leg with %d shots.", playerName, shootingCount);
                break;
            }
            command = scanner.nextLine();
        }

       if (command.equals("Retire")){
            System.out.printf("%s retired after %d unsuccessful shots.",playerName,negativeCount);
        }

    }
}
