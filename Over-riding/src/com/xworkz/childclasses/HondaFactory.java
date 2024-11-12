package com.xworkz.childclasses;

import com.xworkz.things.Factory;

public class HondaFactory extends Factory {

    @Override
    public void manufacture() {
        System.out.println("Manufacturing in HondaFactory");
    }

    @Override
    public void dispose() {
        System.out.println("Dispose of Honda Factory");
    }

    @Override
    public void power() {
        System.out.println("Power of HondaFactory");
    }

    @Override
    public void start() {
        System.out.println("Start of Honda Factory");
    }

    @Override
    public void run() {
        System.out.println("Running Honda Factory");
    }

    public void factoryLocation()
    {
        System.out.println("Narsapura");
    }
}
