package com.xworkz.hospital;
import com.xworkz.hospital.rule.Hospital;

public class FortiesHosp {

    Hospital hosp;

    public FortiesHosp(Hospital hosp)
    {
        this.hosp=hosp;
    }
    void checkHosp()
    {
        boolean clean=hosp.clean();
        if(clean)
        {
            System.out.println("Hospital is clean...!");
        }
        else{
            System.out.println("Hospital is not clean...!");
        }
    }
}
