package com.xworkz.webApplication.childclasses;

import com.xworkz.webApplication.things.WebApplication;

public class Zomato extends WebApplication {

    @Override
    public void typeOfApplication() {
        System.out.println("Food Delivery...!");
    }

    public void selectRestaurant()
    {
        System.out.println("Select Restaurant...!");
    }
}
