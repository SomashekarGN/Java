package com.xworkz.ruleImpl;

import com.xworkz.rule.TrafficRule;

public class TrafficeImpl implements TrafficRule {


    @Override
    public boolean wearingHelmet() {
        return true;
    }

    @Override
    public int speedLimit() {
        return 40;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
