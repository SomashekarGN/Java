package com.xworkz.hospital.runner;

import com.xworkz.hospital.CanaraBank;
import com.xworkz.hospital.Impl.BankImpl;

public class BankRunner {
    public static void main(String[] args) {

        BankImpl bi=new BankImpl();
        CanaraBank cr=new CanaraBank(bi);

        cr.openSavingsAccount();
        cr.closeSavingsAccount();
    }
}
