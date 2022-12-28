package Exam_practice;

import java.util.Scanner;

public class Sima_i_proizvedenie_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        int count=0;
        boolean found=false;
        for (int a = 1; a <=9 ; a++) {
            for (int b = 9; b >=a ; b--) {
                for (int c = 0; c <=9 ; c++) {
                    for (int d = 9; d >=c ; d--) {

                        int plusResult=a+b+c+d;
                        int multiplied=a*b*c*d;

                        if (plusResult==multiplied && n%10==5) {
                            count++;
                            System.out.printf("%d%d%d%d",a,b,c,d);
                            found=true;
                            break;
                        }
                         else    if (multiplied/plusResult==3 && n%3==0){
                             count++;
                                System.out.printf("%d%d%d%d",d,c,b,a);
                                found=true;
                                break;

                            }
                        }
                    if (found) {
                        break;
                    }
                    }if (found) {
                    break;
                }
                }if (found) {
                break;
            }

        }
        if (count==0){
            System.out.println("Nothing found");
        }
    }

}
