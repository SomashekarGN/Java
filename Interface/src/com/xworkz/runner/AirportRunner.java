package com.xworkz.runner;

import com.xworkz.ruleImpl.AirportImpl;

public class AirportRunner {

    public static void main(String[] args) {

        AirportImpl airport=new AirportImpl();
        boolean arrive=airport.arriveBefore();
        System.out.println(arrive);

        String id=airport.idProof();
        System.out.println(id);
    }
}
