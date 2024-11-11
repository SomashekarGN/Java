package com.xworkz.runner;

import com.xworkz.example5.*;

public class Example5Runner {

    public static void main(String[] args) {

        Transportation transportation=new Transportation();
        Transportation transportation1=new LandTransport();
        Transportation transportation2=new Vechiles();
        Transportation transportation3=new TwoWheelers();
        Transportation transportation4=new Bike();
        Transportation transportation5=new EV();
        Transportation transportation6=new DistanceCovered();

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

        LandTransport landTransport=new LandTransport();
        LandTransport landTransport1=new Vechiles();
        LandTransport landTransport2=new TwoWheelers();
        LandTransport landTransport3=new Bike();
        LandTransport landTransport4=new EV();
        LandTransport landTransport5=new DistanceCovered();

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");


        Vechiles vechiles=new Vechiles();
        Vechiles vechiles1=new TwoWheelers();
        Vechiles vechiles2=new Bike();
        Vechiles vechiles3=new EV();
        Vechiles vechiles4=new DistanceCovered();

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

        TwoWheelers twoWheelers=new TwoWheelers();
        TwoWheelers twoWheelers1=new Bike();
        TwoWheelers twoWheelers2=new EV();
        TwoWheelers twoWheelers3=new DistanceCovered();

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

        Bike bike=new Bike();
        Bike bike1=new EV();
        Bike bike2=new DistanceCovered();

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

        EV ev=new EV();
        EV ev1=new DistanceCovered();

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

        DistanceCovered distanceCovered=new DistanceCovered();


    }
}
