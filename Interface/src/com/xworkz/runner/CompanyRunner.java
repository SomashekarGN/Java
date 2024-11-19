package com.xworkz.runner;

import com.xworkz.ruleImpl.CompanyImpl;

public class CompanyRunner {

    public static void main(String[] args) {

        CompanyImpl company=new CompanyImpl();
        boolean arrive =company.isArrivedOnTime();
        System.out.println("Employee Arrived in Time :"+arrive);

        boolean fulltime=company.isFullTimeEmp();
        System.out.println("Employee Type :"+fulltime);

        int sal=company.salaryOfTheEmp();
        System.out.println("Employee Salary :"+sal);

        String dep=company.empDepartment();
        System.out.println("Employee deparment :"+dep);
    }
}
