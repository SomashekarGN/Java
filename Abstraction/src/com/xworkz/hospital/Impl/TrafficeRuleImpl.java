package com.xworkz.hospital.Impl;

import com.xworkz.hospital.rule.TrafficRule;

import javax.xml.bind.SchemaOutputResolver;

public class TrafficeRuleImpl implements TrafficRule {
    @Override
    public boolean wearingHelmet() {
        return true;
    }

    @Override
    public void vechileNumberPlate() {
        System.out.println("KA 25 HH 7035");
    }

    @Override
    public int speed() {
        return 0;
    }
}
