package For_Loop_More_Exercise;

import java.util.Scanner;

public class Hospital_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int period = Integer.parseInt(scanner.nextLine());


        var docotors = 7;
        var patientsleft = 0;
        var treatedPatients = 0;

        for (int i = 1; i <= period; i++) {

            int patientsforaDay = Integer.parseInt(scanner.nextLine());


            if (i % 3 == 0 && patientsleft > treatedPatients) {
                docotors += 1;


            }
            if (docotors < patientsforaDay) {
                treatedPatients += docotors;
                patientsleft += patientsforaDay - docotors;


            } else {

                treatedPatients += patientsforaDay;

            }

        }

        System.out.printf("Treated patients: %d.%nUntreated patients: %d.", treatedPatients, patientsleft);
    }
}