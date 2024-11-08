package com.xworkz.typesOfinhertance;
import com.xworkz.typesOfinhertance.subclasses.ClientSide;
import com.xworkz.typesOfinhertance.subclasses.ServerSide;

public abstract class WebApplications implements ServerSide,ClientSide {

    abstract public void typeOfApplication();

    public void check()
    {
        System.out.println("Check in Web Application");
    }
}
