package com.xworkz.ruleImpl;

import com.xworkz.rule.AirportRule;

public class AirportImpl implements AirportRule {
    @Override
    public boolean arriveBefore() {
        return true;
    }

    @Override
    public String idProof() {
        return "Driving License";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
