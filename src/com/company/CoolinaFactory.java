package com.company;

public class CoolinaFactory implements KitchenwareFactory{
    @Override
    public Knife createKnife() {
        return new CoolinaKnife();
    }

    @Override
    public Pot createPot() {
        return new CoolinaPot();

    }

    @Override
    public HoningStone createHoningStone() {
        return new CoolinaHoningStone();
    }
}
