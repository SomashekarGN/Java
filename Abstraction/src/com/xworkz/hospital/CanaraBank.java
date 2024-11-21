package com.xworkz.hospital;
import com.xworkz.hospital.rule.BankRule;

public class CanaraBank {

    BankRule br;

    public CanaraBank(BankRule br)
    {
        this.br=br;
    }

    public void openSavingsAccount()
    {
        int check=br.openAccount();
        System.out.println(check);
//        if(check==0)
//        {
//            System.out.println("Account Open successful...!");
//        }
//        else
//        {
//            System.out.println("Account not opened...!");
//        }
      }

    public void closeSavingsAccount()
    {
        br.closeAccount();
    }
}
