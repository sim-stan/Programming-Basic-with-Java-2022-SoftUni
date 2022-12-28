import java.util.Scanner;

public class kurier_express {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double boxWeight = Double.parseDouble(scanner.nextLine());
        String shippingOptions= scanner.nextLine();
        int distance = Integer.parseInt(scanner.nextLine());

        double price=0.0;

        switch (shippingOptions){


            case "standard":

                if(boxWeight<1) {
                    price=distance*0.03;

                } else if (boxWeight>=1 && boxWeight<10) {
                    price=distance*0.05;
                } else if (boxWeight>=10 && boxWeight<40) {
                    price=distance * 0.10;

                } else if (boxWeight>=40 && boxWeight<90) {
                    price=distance*0.15;
                }else if (boxWeight>=90 && boxWeight<150) {
                    price = distance * 0.2;
                }
                break;

            case "express":

                if(boxWeight<1) {
                    price=boxWeight*(0.8 *0.03) * distance+ distance*0.03;

                } else if (boxWeight>=1 && boxWeight<10) {
                    price=boxWeight*(0.4 *0.05) * distance+ distance*0.05;
                } else if (boxWeight>=10 && boxWeight<40) {
                    price=boxWeight*(0.05 *0.10) * distance+ distance*0.10;

                } else if (boxWeight>=40 && boxWeight<90) {
                    price=boxWeight*(0.02 *0.15) * distance + distance*0.15;
                }else if (boxWeight>=90 && boxWeight<150) {
                    price=boxWeight*(0.01 *0.02) * distance + distance*0.2;
                }

        }
        System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.",boxWeight,price);
    }
}
