package com.xworkz.hospital.Impl;

import com.xworkz.hospital.rule.CompanyRule;

public class CompanyImpl implements CompanyRule {
    @Override
    public boolean holiday() {
        System.out.println("Today is Declared holiday..!");
        return true;
    }
}
