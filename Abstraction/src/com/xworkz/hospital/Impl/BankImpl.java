package com.xworkz.hospital.Impl;

import com.xworkz.hospital.rule.BankRule;

public class BankImpl implements BankRule {
    @Override
    public int openAccount() {
        System.out.println("Savings A/C opened with balance of : ");
        return 0;
    }

    @Override
    public void closeAccount() {
        System.out.println("Account closed Successfully...!");
    }
}
