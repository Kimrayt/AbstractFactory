package com.company;

public class SamuraHoningStone implements HoningStone{
    public static int price = 100;
    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void honeKnife() {
        System.out.println("You don't have a knife!");
    }

    @Override
    public void honePot() {
        System.out.println("Bad idea. Just bad idea");
    }
}
