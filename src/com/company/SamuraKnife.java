package com.company;

import java.util.Scanner;

public class SamuraKnife implements Knife{
    public static double price = 100;
    int sharpness = 3;
    public void testSharpness() {
        System.out.println("Are you sure? Y/N");
        Scanner in = new Scanner (System.in);
        String a = in.nextLine();
        if (a == "Y"){
            if (sharpness <= 10){
                System.out.println("Edge is just okay");
            }
            else if (sharpness > 10 && sharpness <= 20){
                System.out.println("Occam's razor is going to loose it's title");
            }
            else if (sharpness >20 && sharpness <= 40){
                System.out.println("Unnecessary entities are cut altogether with your finger");
            }
            else if (sharpness > 40){
                System.out.println("Your edge became sharp enough to cut through atoms");
            }

        }
        else if (a == "N"){
            System.out.println("Wise decision");
        }
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void cut() {
        if (sharpness < 40){
            System.out.println("What are you gonna cut?" + "1. Tomato" + "2. Honing stone" + "3. Yourself" + "4. Cute little rabbit");
            Scanner in = new Scanner (System.in);
            int a = in.nextInt();
            if (a == 1){
                System.out.println("Add some mozzarella and seasoning to make wonderful salad");
            }
            else if (a == 2){
                sharpness-=5;
                if (sharpness <=0){
                    System.out.println("Knife is broken. Congrats");
                }
                else if (sharpness >0){
                    System.out.println("Try again");
                }
            }
        }
        else if (sharpness >=40){
            System.out.println("Atomic explosion started nuclear winter. Enjoy hopeless world, created by your foolishness");
        }
    }
    public int sharpen(){
        sharpness+=10;
        return sharpness;
    }
}
