package com.xworkz.runner;

import com.xworkz.ruleImpl.TrafficeImpl;

public class TrafficRunner {

    public static void main(String[] args) {

        TrafficeImpl traffice=new TrafficeImpl();
        boolean res=traffice.wearingHelmet();
        System.out.println(res);

        int speed=traffice.speedLimit();
        System.out.println(speed);

        traffice.toString();
    }
}
