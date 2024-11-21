package com.xworkz.hospital.Impl;
import com.xworkz.hospital.rule.Hospital;

public class HospitalImpl implements Hospital {

    @Override
    public boolean clean() {
        System.out.println("Hospital is clean...!");
        return true;
    }
}
