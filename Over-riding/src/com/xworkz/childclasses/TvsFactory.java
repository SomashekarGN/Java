package com.xworkz.childclasses;

import com.xworkz.things.Factory;

public class TvsFactory extends Factory {

    @Override
    public void manufacture() {
        System.out.println("Manufacturing in TVS Factory");
    }

    @Override
    public void dispose() {
        System.out.println("Dispose of TVS Factory");
    }

    @Override
    public void power() {
        System.out.println("Power of TVS Factory");
    }

    @Override
    public void start() {
        System.out.println("Start of TVS Factory");
    }

    @Override
    public void run() {
        System.out.println("Running TVS Factory");
    }

    public void factoryLocation()
    {
        System.out.println("Coiambator");
    }
}
