package com.xworkz.childclasses;

import com.xworkz.things.Factory;

public class HyundaiFactory extends Factory {

    @Override
    public void manufacture() {
        System.out.println("Manufacturing in Hyundai Factory");
    }

    @Override
    public void dispose() {
        System.out.println("Dispose of Hyundai Factory");
    }

    @Override
    public void power() {
        System.out.println("Power of Hyundai Factory");
    }

    @Override
    public void start() {
        System.out.println("Start of Hyundai Factory");
    }

    @Override
    public void run() {
        System.out.println("Running Hyundai Factory");
    }

    public void factoryLocation()
    {
        System.out.println("Bidadi");
    }
}
