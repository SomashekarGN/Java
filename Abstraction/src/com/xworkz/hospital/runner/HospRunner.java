package com.xworkz.hospital.runner;

import com.xworkz.hospital.FortiesHosp;
import com.xworkz.hospital.Impl.HospitalImpl;
import com.xworkz.hospital.rule.Hospital;

public class HospRunner {

    public static void main(String[] args) {

        HospitalImpl hospital=new HospitalImpl();
        FortiesHosp hosp=new FortiesHosp(hospital);

        hospital.clean();
    }
}
