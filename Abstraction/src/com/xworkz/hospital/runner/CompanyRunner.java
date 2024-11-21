package com.xworkz.hospital.runner;

import com.xworkz.hospital.Impl.CompanyImpl;
import com.xworkz.hospital.XworkzCompany;
import com.xworkz.hospital.rule.CompanyRule;

public class CompanyRunner {
    public static void main(String[] args) {

        CompanyImpl cr=new CompanyImpl();
        XworkzCompany xc=new XworkzCompany(cr);

        cr.holiday();
    }
}
