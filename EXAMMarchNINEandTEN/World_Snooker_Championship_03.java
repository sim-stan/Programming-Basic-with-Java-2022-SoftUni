package EXAMMarchNINEandTEN;

import java.util.Scanner;

public class World_Snooker_Championship_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String stageOfChampionship= scanner.nextLine();
        String ticketType= scanner.nextLine();
        int ticketsCount = Integer.parseInt(scanner.nextLine());
        String picturYorN=scanner.nextLine();

        double price=0.0;

        switch (stageOfChampionship) {

            case "Quarter final":
            if (ticketType.equals("Standard")){
                price=ticketsCount * 55.5;

                if (price>4000){

                    price=price*0.75;

                } else if (price>=2500) {
                    price=price*0.90;
                    if (picturYorN.equals("Y")){
                        price=price + (ticketsCount*40);
                    }
                }

            } else if (ticketType.equals("Premium")) {
                price=ticketsCount * 105.2;

                if (price>4000){

                    price=price*0.75;

                } else if (price>=2500) {
                    price=price*0.90;
                    if (picturYorN.equals("Y")){
                        price=price + (ticketsCount*40);
                    }
                }

            }else if (ticketType.equals("VIP")) {
                price=ticketsCount * 118.9;

                if (price>4000){

                    price=price*0.75;

                } else if (price>=2500) {
                    price=price*0.90;
                    if (picturYorN.equals("Y")){
                        price=price + (ticketsCount*40);
                    }
                }
            }
                break;

            case "Semi final":
                if (ticketType.equals("Standard")){
                    price=ticketsCount * 75.88;

                    if (price>4000){

                        price=price*0.75;

                    } else if (price>=2500) {
                        price=price*0.90;
                        if (picturYorN.equals("Y")){
                            price=price + (ticketsCount *40);
                        }
                    }


                } else if (ticketType.equals("Premium")) {
                    price=ticketsCount * 125.22;

                    if (price>4000){

                        price=price*0.75;

                    } else if (price>=2500) {
                        price=price*0.90;
                        if (picturYorN.equals("Y")){
                            price=price + (ticketsCount*40);
                        }
                    }


                }else if (ticketType.equals("VIP")){
                    price=ticketsCount * 300.4;

                    if (price>4000){

                        price=price*0.75;

                    } else if (price>=2500) {
                        price=price*0.90;
                        if (picturYorN.equals("Y")){
                            price=price + (ticketsCount*40);
                        }
                    }
                }
                break;
            case "Final":
                if (ticketType.equals("Standard")){
                    price=ticketsCount * 110.1;

                    if (price>4000){

                        price=price*0.75;

                    } else if (price>=2500) {
                        price=price*0.90;
                        if (picturYorN.equals("Y")){
                            price=price + (ticketsCount*40);
                        }
                    }


                } else if (ticketType.equals("Premium")) {
                    price=ticketsCount * 160.66;

                    if (price>4000){

                        price=price*0.75;

                    } else if (price>=2500) {
                        price=price*0.90;
                        if (picturYorN.equals("Y")){
                            price=price + (ticketsCount*40);
                        }
                    }


                }else if (ticketType.equals("VIP")){
                    price=ticketsCount * 400;

                    if (price>4000){

                        price=price*0.75;

                    } else if (price>=2500) {
                        price=price*0.90;
                        if (picturYorN.equals("Y")){
                            price=price + (ticketsCount*40);
                        }
                    }
                }
                break;
        }

        System.out.printf("%.2f", price);

    }
}
