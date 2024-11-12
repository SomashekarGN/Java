package com.xworkz.runner;

import com.xworkz.childclasses.HondaFactory;
import com.xworkz.childclasses.HyundaiFactory;
import com.xworkz.childclasses.TataFactory;
import com.xworkz.childclasses.TvsFactory;
import com.xworkz.things.Factory;

public class FactoryRunner {
    public static void main(String[] args) {


        Factory factory = new TataFactory();
        factory.manufacture();
        factory.dispose();
        factory.power();
        factory.start();
        factory.run();

        TataFactory tf=new TataFactory();
        tf.manufacture();
        tf.dispose();
        tf.power();
        tf.start();
        tf.run();
        tf.factoryLocation();

        Factory factory1=new HondaFactory();
        factory1.manufacture();
        factory1.dispose();
        factory1.power();
        factory1.start();
        factory1.run();

        HondaFactory hf=new HondaFactory();
        hf.manufacture();
        hf.dispose();
        hf.power();
        hf.start();
        hf.run();
        hf.factoryLocation();

        Factory factory2=new HyundaiFactory();
        factory2.manufacture();
        factory2.dispose();
        factory2.power();
        factory2.start();
        factory2.run();

        HyundaiFactory hyf=new HyundaiFactory();
        hyf.manufacture();
        hyf.dispose();
        hyf.power();
        hyf.start();
        hyf.run();
        hyf.factoryLocation();

        Factory factory3=new TvsFactory();
        factory3.manufacture();
        factory3.dispose();
        factory3.power();
        factory3.start();
        factory3.run();

        TvsFactory tf2=new TvsFactory();
        tf2.manufacture();
        tf2.dispose();
        tf2.power();
        tf2.start();
        tf2.run();
        tf2.factoryLocation();
    }
}
