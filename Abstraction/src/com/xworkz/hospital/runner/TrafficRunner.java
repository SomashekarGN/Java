package com.xworkz.hospital.runner;

import com.xworkz.hospital.Impl.TrafficeRuleImpl;
import com.xworkz.hospital.TrafficePolice;

public class TrafficRunner {
    public static void main(String[] args) {

        TrafficeRuleImpl trl=new TrafficeRuleImpl();
        TrafficePolice tp=new TrafficePolice(trl);

        tp.helmetCheck();
        tp.noPlate();
        tp.speedCheck();
    }
}
