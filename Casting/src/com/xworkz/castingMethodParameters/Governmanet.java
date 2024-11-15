package com.xworkz.castingMethodParameters;

public class Governmanet {

    public void run(PublicServant servant) {
        System.out.println("Governmnet Runs...");
        servant.protectIPC();

        if (servant instanceof PoliceOfficer) {
            PoliceOfficer policeOfficer = (PoliceOfficer) servant;
            policeOfficer.controlCrime();
        }
        if (servant instanceof Inspector) {
            Inspector inspector = (Inspector) servant;
            inspector.controlStation();
        }
        if (servant instanceof TrafficPolice) {
            TrafficPolice tp = (TrafficPolice) servant;
            tp.controlTraffic();
        }
        if (servant instanceof TicketCollector) {
            TicketCollector tc = (TicketCollector) servant;
            tc.checkTicket();
        }

    }
}
