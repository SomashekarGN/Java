package com.xworkz.ruleImpl;

import com.xworkz.rule.CompanyRule;

public class CompanyImpl implements CompanyRule {
    @Override
    public boolean isArrivedOnTime() {
        return true;
    }

    @Override
    public boolean isFullTimeEmp() {
        return true;
    }

    @Override
    public int salaryOfTheEmp() {
        return 40000;
    }

    @Override
    public String empDepartment() {
        return "Developer";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
