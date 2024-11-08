package com.xworkz.typesOfinhertance.subclasses;
import com.xworkz.typesOfinhertance.WebApplications;

public class Flipkart extends WebApplications {


    @Override
    public void typeOfApplication() {
        System.out.println("E-commerce Application : @Flipkart...!");
    }

    public boolean isAvaliableForUsers()
    {
        System.out.println("Avaliable");
        return true;
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
