package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {



    while (money >0){
        Knife k = null;
        Pot p = null;
        HoningStone h = null;
        System.out.println("Your current belongings is "+ money);
        System.out.println("What you would like to buy? " + "1. Knife " + "2. Pot " + "3. Honing stone");
        Scanner in = new Scanner (System.in);
        int type = in.nextInt();
        System.out.println("Which manufacturer do you prefer? " + "1. Samura " + "2. Coolina");
        int man = in.nextInt();
        KitchenwareFactory creator;
        String product = null;

        creator = man == 1? new SamuraFactory(): new CoolinaFactory();
            if (type == 1) {
                Knife k = creator.createKnife();
                money -= SamuraKnife.price;
                System.out.println("Money left: "+ money);
                product = "knife";

            }
            else if (type == 2) {
                Pot p =creator.createPot();
                money -= SamuraPot.price;
                System.out.println("Money left: "+ money);
                product = "pot";

            }
            else if (type == 3) {
                HoningStone h = creator.createHoningStone();
                money -= SamuraHoningStone.price;
                System.out.println("Money left: "+ money);
                product = "honing stone";

            }
        if (Objects.equals(product, "knife")){
            System.out.println("What you would like to do with a knife? 1. ");
            boolean end = false;
            while (!end) {
                System.out.println("What you would like to do with a knife? "+ "1. Test sharpness " + "2. Cut "+ "3. Sharpen");
                int a = in.nextInt();
                if (a == 1){
                    k.testSharpness();
                }
                else if (a == 2){
                    k.cut();
                }
                else if (a == 3){
                    k.sharpen();
                }
                System.out.println("Would you like to continue playing with your purchase? Y/N");
                String b = in.nextLine();
                end = b == "N"? true:false;
            }
        }
        else if (Objects.equals(product, "pot")){
            boolean end = false;
            while (!end) {
                System.out.println("What you would like to do with a pot? "+ "1. Boil something" + "2. Put it on");
                int a = in.nextInt();
                if (a == 1){
                p.boilSomething();
                }
                else if (a == 2){
                p.putOn();
                }
                System.out.println("Would you like to continue playing with your purchase? Y/N");
                String b = in.nextLine();
                end = b == "N"? true:false;
            }
        }
        else if (Objects.equals(product, "honing stone")){
            boolean end = false;
            while (!end){
            System.out.println("What you would like to do with a honing stone? "+ "1. Hone knife " + "2. Hone pot ");
                int a = in.nextInt();
                if (a == 1){
                    h.honeKnife();
                }
                else if (a == 2){
                    h.honePot();
                }
                System.out.println("Would you like to continue playing with your purchase? Y/N");
                String b = in.nextLine();
                end = b == "N"? true:false;
            }
        }
    }
    }
    public static void bankrupt(){
        Main.money = 0;
    }
    private static int money = 500;
}
