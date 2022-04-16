package com.company;

import java.util.Scanner;

public class SamuraPot implements Pot{
    public static double price = 200;
    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void boilSomething() {
        System.out.println("What you would like to boil? " + "1. Egg" + " 2. Pasta" + " 3. Lamb in a milk of it's mother");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a == 1){
            System.out.println("Done! Don't forget to add some mayo");
        }
        else if (a == 2 ){
            System.out.println("Yummy!");
        }
        else if (a == 3){
            System.out.println("That's against Kashrut!");
        }

    }

    @Override
    public void putOn() {
        System.out.println("Stat changes: DEF + 5, CHA - 10");
    }

}
