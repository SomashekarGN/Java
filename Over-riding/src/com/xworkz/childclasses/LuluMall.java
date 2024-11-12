package com.xworkz.childclasses;

import com.xworkz.things.Mall;

public class LuluMall extends Mall {

    @Override
    public void open() {
        System.out.println("Lulu Mall Open");
    }

    @Override
    public void close() {
        System.out.println("Lulu Mall Closed");
    }

    @Override
    public void elevator() {
        System.out.println("Elevator in LuluMall");
    }

    @Override
    public void security() {
        System.out.println("Security in Lulu mall");
    }

    public void location()
    {
        System.out.println("Majestic Dr.Rajkumar Road");
    }
}
