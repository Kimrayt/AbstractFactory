package com.company;

public class SamuraFactory implements KitchenwareFactory{
    @Override
    public Knife createKnife() {
        return new SamuraKnife();
    }

    @Override
    public Pot createPot() {
        return new SamuraPot();
    }

    @Override
    public HoningStone createHoningStone() {
        return new SamuraHoningStone();
    }
}
