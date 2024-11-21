package com.xworkz.hospital;

import com.xworkz.hospital.rule.TrafficRule;

public class TrafficePolice {

    private  TrafficRule tr;

    public TrafficePolice(TrafficRule tr)
    {
        this.tr=tr;
    }

    public void helmetCheck()
    {
        boolean check=tr.wearingHelmet();
        if(check==true)
        {
            System.out.println("Wearing Helmet");
        }
        else
            System.out.println("Not Wearing Helmet");
    }
    
    public void noPlate()
    {
        tr.vechileNumberPlate();
    }

    public void speedCheck()
    {
        int fast=tr.speed();
        if(fast<=40)
        {
            System.out.println("Speed in control...!");
        }
        else
        {
            System.out.println("Overspeeding...!");
        }
    }


}
