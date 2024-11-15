package com.xworkz.castingMethodParameters;

public class TrafficPolice extends PoliceOfficer{

    @Override
    public void controlCrime() {
        System.out.println("Traffic Police helps controls crime...");
    }

    public void controlTraffic()
    {
        System.out.println("Traffic police controls traffic...");
    }
}
