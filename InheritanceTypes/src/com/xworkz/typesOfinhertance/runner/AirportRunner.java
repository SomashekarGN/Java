package com.xworkz.typesOfinhertance.runner;

import com.xworkz.typesOfinhertance.AirportRuleImpl;
import com.xworkz.typesOfinhertance.subclasses.AirportRule;

public class AirportRunner {
    public static void main(String[] args) {


        AirportRuleImpl a=new AirportRuleImpl();
        a.arriveBefore();
        a.idProof();
        a.loungeAccess();

        AirportRule aa=new AirportRuleImpl();
        aa.arriveBefore();
        aa.idProof();

        Object o=new AirportRuleImpl();
        o.toString();
    }
}
