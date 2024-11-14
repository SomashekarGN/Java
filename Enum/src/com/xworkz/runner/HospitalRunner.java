package com.xworkz.runner;

import com.xworkz.constants.HospitalBranch;
import com.xworkz.things.Hospital;


public class HospitalRunner {

    public static void main(String[] args) {


        Hospital hospital=new Hospital("Rainbow","Bangalore");
        hospital.hospitalBranch=HospitalBranch.VIJAYNAGAR;
        hospital.print();
    }
}
