package com.xworkz.webApplication.Runner;

import com.xworkz.webApplication.childclasses.Flipkart;
import com.xworkz.webApplication.childclasses.Myntra;
import com.xworkz.webApplication.childclasses.Zomato;
import com.xworkz.webApplication.things.WebApplication;

public class WebApplicationRunner {
    public static void main(String[] args) {

        WebApplication webApplication=new WebApplication();
        webApplication.typeOfApplication();
        webApplication.request();
        webApplication.response();

        Myntra myntra=new Myntra();
        myntra.typeOfApplication();;
        myntra.request();
        myntra.response();

        Zomato zomato=new Zomato();
        zomato.typeOfApplication();
        zomato.selectRestaurant();
        zomato.request();
        zomato.response();

        Flipkart flipkart=new Flipkart();
        flipkart.typeOfApplication();
        flipkart.categories();
        flipkart.request();
        flipkart.response();
    }
}
