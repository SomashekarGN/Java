package com.xworkz.runner;

import com.xworkz.example2.Computer;
import com.xworkz.example2.Device;
import com.xworkz.example2.Machine;
import com.xworkz.example2.Mobile;

public class Example2Runner {

    public static void main(String[] args) {

        Machine machine=new Machine();
        Machine machine1=new Device();
        Machine machine2=new Computer();
        Machine machine3=new Mobile();

        System.out.println("-----------------------------------------------");

        Device device=new Device();
        Device device1=new Computer();
        Device device2=new Mobile();

        System.out.println("-----------------------------------------------");

        Computer computer=new Computer();
        Computer computer1=new Mobile();

        System.out.println("-----------------------------------------------");

        Mobile mobile=new Mobile();

    }
}
