package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

    while (money >0){
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
        if (product == "knife"){
            System.out.println("What you would like to do with a knife? 1. ");

        }
        else if (product == "pot"){
            boolean end = false;
            while (end == false) {
                System.out.println("What you would like to do with a pot? "+ "1. Boil something" + "2. Put it on");
                int a = in.nextInt();
                if (a == 1){
                p.boilSometing;
                }
                else if (a == 2){
                p.putOn;
                }
            }
        }
        else if (product == "honing stone"){
            System.out.println("What you would like to do with a honing stone?");

        }
    }
    }
    public static void bankrupt(){
        Main.money = 0;
    }
    private static int money = 500;
}
