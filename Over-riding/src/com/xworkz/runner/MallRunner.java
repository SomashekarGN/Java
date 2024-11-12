package com.xworkz.runner;

import com.xworkz.childclasses.LuluMall;
import com.xworkz.childclasses.MantriMall;
import com.xworkz.childclasses.OrionMall;
import com.xworkz.things.Mall;

public class MallRunner {
    public static void main(String[] args) {
        Mall mall = new OrionMall();
        mall.open();
        mall.close();
        mall.elevator();
        mall.security();

        System.out.println("//////////////////////////////////////////////");
        OrionMall omall = new OrionMall();
        omall.open();
        omall.close();
        omall.elevator();
        omall.security();
        omall.location();

        System.out.println("-----------------------------------------------");

        Mall mall1=new LuluMall();
        mall1.open();
        mall1.close();
        mall1.elevator();
        mall1.security();

        System.out.println("____________________________________________");

        LuluMall luluMall=new LuluMall();
        luluMall.open();
        luluMall.close();
        luluMall.elevator();
        luluMall.security();
        luluMall.location();

        System.out.println("**************************************************");

        Mall mall2=new MantriMall();
        mall2.open();
        mall2.close();
        mall2.elevator();
        mall2.security();

        System.out.println("8888888888888888888888888888888888888888888888888888");

        MantriMall mantriMall=new MantriMall();
        mantriMall.open();
        mantriMall.close();
        mantriMall.elevator();
        mantriMall.security();
        mantriMall.location();

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

    }
}
