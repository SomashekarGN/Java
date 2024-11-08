package com.xworkz.typesOfinhertance;

import com.xworkz.typesOfinhertance.subclasses.AirportRule;

public class AirportRuleImpl implements AirportRule {
    @Override
    public boolean arriveBefore() {
        return true;
    }

    @Override
    public String idProof() {
        return "Driving Lisence";
    }

    public void loungeAccess()
    {
        System.out.println("Only for Bussiness Class Passengers...!");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
