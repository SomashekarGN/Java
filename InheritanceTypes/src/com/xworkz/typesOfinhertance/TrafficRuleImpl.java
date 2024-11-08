package com.xworkz.typesOfinhertance;
import com.xworkz.typesOfinhertance.subclasses.TrafficRule;

public class TrafficRuleImpl implements TrafficRule {
    @Override
    public boolean wearingHelmet() {
        System.out.println("Is Rider Wearing helmet or NO...!");
        return true;
    }

    @Override
    public int speedLimit() {
        System.out.println("Speed Limit is 40Km...!");
        return 40;
    }

    public void overTake()
    {
        System.out.println("Always Overtake On the Right...!");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
