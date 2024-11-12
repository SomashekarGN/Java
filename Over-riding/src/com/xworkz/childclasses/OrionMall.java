package com.xworkz.childclasses;

import com.xworkz.things.Mall;

public class OrionMall extends Mall {

    @Override
    public void open() {
       // super.open();
        System.out.println("Orion Mall Open");
    }

    @Override
    public void close() {
        System.out.println("Orion Mall Closed");
    }

    @Override
    public void elevator() {
        System.out.println("Elevator in Orion Mall");
    }

    @Override
    public void security() {
        System.out.println("Security in Orion Mall");
    }

    public void location()
    {
        System.out.println("Dr.RajkumarRoad yeshwanthpur");
    }
}
