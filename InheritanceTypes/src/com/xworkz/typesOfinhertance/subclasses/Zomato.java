package com.xworkz.typesOfinhertance.subclasses;
import com.xworkz.typesOfinhertance.WebApplications;

public class Zomato extends WebApplications {
    @Override
    public void typeOfApplication() {
        System.out.println("Food Delivery : Zomato");
    }

    @Override
    public void check() {
        System.out.println("Check in Zomato...!");
    }

    public boolean isAvaliableinAllCities()
    {
        System.out.println("Avaliable in all Cities :");
        return false;
    }

    @Override
    public void response() {
        System.out.println("Responds...!");
    }

    @Override
    public void request() {
        System.out.println("Requests...!");
    }
}
