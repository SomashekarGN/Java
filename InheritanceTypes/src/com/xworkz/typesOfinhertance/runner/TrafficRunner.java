package com.xworkz.typesOfinhertance.runner;

import com.xworkz.typesOfinhertance.TrafficRuleImpl;
import com.xworkz.typesOfinhertance.subclasses.TrafficRule;

public class TrafficRunner {

    public static void main(String[] args) {

        TrafficRuleImpl I=new TrafficRuleImpl();
        I.speedLimit();
        I.wearingHelmet();
        I.overTake();

        TrafficRule trafficRule=new TrafficRuleImpl();
        trafficRule.speedLimit();
        trafficRule.wearingHelmet();


        Object o=new TrafficRuleImpl();
        o.toString();

    }
}
