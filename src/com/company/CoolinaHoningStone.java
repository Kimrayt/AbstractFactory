package com.company;

public class CoolinaHoningStone implements HoningStone{
    public static int price = 150;
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
