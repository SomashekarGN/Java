package com.xworkz.runner;

import com.xworkz.castingMethodParameters.*;

public class CastingRunner {

    public static void main(String[] args) {
        PublicServant ps=new PublicServant();
       PublicServant ps1=new PoliceOfficer();
       PublicServant ps2=new Inspector();
        PublicServant ps3=new TrafficPolice();
        PublicServant ps4=new TicketCollector();


        Governmanet gm=new Governmanet();
        gm.run(ps);
        gm.run(ps1);
        gm.run(ps2);
        gm.run(ps3);
        gm.run(ps4);


        PoliceStation policeStation=new PoliceStation();
        PoliceOfficer po=new PoliceOfficer();
        PoliceOfficer po1=new Inspector();
        PoliceOfficer po2=new TrafficPolice();
        policeStation.justice(po);
        policeStation.justice(po1);
        policeStation.justice(po2);


        Railways railways=new Railways();
        railways.validateTicket(ps);
        railways.validateTicket(ps1);
        railways.validateTicket(ps2);
        railways.validateTicket(ps3);
        railways.validateTicket(ps4);


    }
}
