package com.xworkz.things;

import com.xworkz.constants.HospitalBranch;
import com.xworkz.constants.HospitalSpecilization;

public class Hospital {
    String hospitalName;
    String location;
    HospitalSpecilization hs=HospitalSpecilization.ENT;
    public HospitalBranch hospitalBranch;

    public Hospital(String hospitalName, String location)
    {
        this.hospitalName=hospitalName;
        this.location=location;

    }

    public void print()
    {
        System.out.println("Hospital Name :"+this.hospitalName);
        System.out.println("Hospital location :"+this.location);
        System.out.println("Hospital Specilization :"+this.hs);
        System.out.println("Hospital branch :"+this.hospitalBranch);
    }
}
