package For_Loop_Exercise;

import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class Oscars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorname = scanner.nextLine();
        double startingPoint =Double.parseDouble(scanner.nextLine());
        int juryCount = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= juryCount; i++) {
            String nameJury = scanner.nextLine();
            double pointsFromjury = Double.parseDouble(scanner.nextLine());

            double gradeforACtor = nameJury.length() * pointsFromjury / 2;
            startingPoint += gradeforACtor;


            if (startingPoint > 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorname, startingPoint);
                break;
            }
        }
        if (startingPoint <= 1250.5) {
            double diff = Math.abs(startingPoint - 1250.5);

            System.out.printf("Sorry, %s you need %.1f more!", actorname, diff);
        }
    }
}