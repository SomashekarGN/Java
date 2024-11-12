package com.xworkz.childclasses;

import com.xworkz.things.Mall;

public class MantriMall extends Mall {

    @Override
    public void open() {
        super.open();
        System.out.println("Mantri Mall open");
    }

    @Override
    public void close() {
        System.out.println("Mantri Mall Closed");
    }

    @Override
    public void elevator() {
        System.out.println("Elevator in Mantri Mall");
    }

    @Override
    public void security() {
        System.out.println("Security in Mantri Mall");
    }

    public void location()
    {
        System.out.println("Malleshwaram");
    }
}
