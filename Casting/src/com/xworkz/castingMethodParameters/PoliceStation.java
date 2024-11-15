package com.xworkz.castingMethodParameters;

public class PoliceStation {

    public void justice(PoliceOfficer officer)
    {
        System.out.println("Justice in PoliceStation...");
        officer.protectIPC();
        officer.controlCrime();

        if(officer instanceof Inspector)
        {
            Inspector inspector=(Inspector) officer;
            inspector.controlStation();
        }
        if (officer instanceof TrafficPolice)
        {
            TrafficPolice tp=(TrafficPolice) officer;
            tp.controlTraffic();
        }
    }


}
