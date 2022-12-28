package For_Loop_Exercise;

import java.util.Scanner;

public class TrekkingMania_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groupsCount = Integer.parseInt(scanner.nextLine());


        int totalppl = 0;
        int sumpplMusalta = 0;
        int sumpplMOnblanc = 0;
        int sumpplKilimanjaro = 0;
        int sumpplK2 = 0;
        int sumpplEverest = 0;

        for (int i = 1; i <=groupsCount ; i++) {

            int pplIngroup = Integer.parseInt(scanner.nextLine());
                totalppl +=pplIngroup;

            if (pplIngroup <= 5) {
                sumpplMusalta += pplIngroup;

            } else if (pplIngroup<=12 ) {

                sumpplMOnblanc +=pplIngroup;
            } else if ( pplIngroup <=25) {
                sumpplKilimanjaro +=pplIngroup;
            } else if (pplIngroup <=40) {
                sumpplK2 += pplIngroup;
            }else {
                sumpplEverest += pplIngroup;
            }

        }
        System.out.printf("%.2f%%%n",1.0 * sumpplMusalta/totalppl*100 );
        System.out.printf("%.2f%%%n",1.0 * sumpplMOnblanc/totalppl*100 );
        System.out.printf("%.2f%%%n",1.0 * sumpplKilimanjaro/totalppl*100 );
        System.out.printf("%.2f%%%n",1.0 * sumpplK2/totalppl*100 );
        System.out.printf("%.2f%%%n",1.0 * sumpplEverest/totalppl*100 );

    }
}
