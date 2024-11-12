package com.xworkz.childclasses;

import com.xworkz.things.Factory;

public class TataFactory extends Factory {

    @Override
    public void manufacture() {
        System.out.println("Manufacturing in TataFactory");
    }

    @Override
    public void dispose() {
        System.out.println("Dispose of TataFactory");
    }

    @Override
    public void power() {
        System.out.println("Power of TataFactory");
    }

    @Override
    public void start() {
        System.out.println("Start of TataFactory");
    }

    @Override
    public void run() {
        System.out.println("Running TataFactory");
    }

    public void factoryLocation()
    {
        System.out.println("Ahmeadabad");
    }
}
