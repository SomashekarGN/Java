package com.xworkz.runner;

import com.xworkz.example4.*;

public class Example4Runner {
    public static void main(String[] args) {


        Bank bank = new Bank();
        Bank bank1 = new SavingsAc();
        Bank bank2 = new PremiumSbAc();
        Bank bank3 = new FDAccount();
        Bank bank4 = new PremiumIntrest();

        System.out.println("*********************************************");

        SavingsAc savingsAc=new SavingsAc();
        SavingsAc savingsAc1=new PremiumSbAc();
        SavingsAc savingsAc2=new FDAccount();
        SavingsAc savingsAc3=new PremiumIntrest();

        System.out.println("*********************************************");

        PremiumSbAc premiumSbAc=new PremiumSbAc();
        PremiumSbAc premiumSbAc1=new FDAccount();
        PremiumSbAc premiumSbAc2=new PremiumIntrest();

        System.out.println("*********************************************");

        FDAccount fdAccount=new FDAccount();
        FDAccount fdAccount1=new PremiumIntrest();

        System.out.println("*********************************************");

        PremiumIntrest premiumIntrest=new PremiumIntrest();


    }
}