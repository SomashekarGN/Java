package com.xworkz.Abstract.runner;

import com.xworkz.Abstract.Army;
import com.xworkz.Abstract.RedArmy;
import com.xworkz.Abstract.WhiteArmy;

public class ArmyRunner {
    public static void main(String[] args) {

        WhiteArmy whiteArmy=new WhiteArmy(25678);
        RedArmy redArmy=new WhiteArmy(10000);
        Army army=new WhiteArmy(55000);
        Object object=new WhiteArmy(233323);

        System.out.println(object);
        System.out.println(whiteArmy);
        System.out.println(redArmy);
        System.out.println(army);

        whiteArmy.useBrahmos();
        whiteArmy.useDrone();
        whiteArmy.protectBorder();
    }
}
