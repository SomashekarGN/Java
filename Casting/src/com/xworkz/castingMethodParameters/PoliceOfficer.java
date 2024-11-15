package com.xworkz.castingMethodParameters;

import java.security.KeyStore;

public class PoliceOfficer extends PublicServant{

    @Override
    public void protectIPC() {
        System.out.println("Police protects IPC section()...");
    }

    public void controlCrime()
    {
        System.out.println("Police Controls Crime");
    }
}
