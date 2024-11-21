package com.xworkz.hospital;
import com.xworkz.hospital.rule.CompanyRule;

public class XworkzCompany {

    CompanyRule cr;

     public XworkzCompany(CompanyRule cr)
     {
         this.cr=cr;
     }

     void checkHoliday()
     {
         boolean check=cr.holiday();
         if(check)
         {
             System.out.println("Company declared Holiday");
         }
         else {
             System.out.println("No Holiday...!");
         }

     }

}
