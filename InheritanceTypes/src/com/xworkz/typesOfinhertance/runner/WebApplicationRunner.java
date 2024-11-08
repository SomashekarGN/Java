package com.xworkz.typesOfinhertance.runner;
import com.xworkz.typesOfinhertance.WebApplications;
import com.xworkz.typesOfinhertance.subclasses.Flipkart;
import com.xworkz.typesOfinhertance.subclasses.Myntra;
import com.xworkz.typesOfinhertance.subclasses.ServerSide;
import com.xworkz.typesOfinhertance.subclasses.Zomato;

public class WebApplicationRunner {
    public static void main(String[] args) {

//        WebApplications webApplications=new Flipkart();
//        //System.out.println(webApplications);
//        webApplications.check();
//        webApplications.typeOfApplication();
//        webApplications.request();
//        webApplications.response();
//
//        System.out.println("////////////////////////////////////////////////////");
//        Flipkart flipkart=new Flipkart();
//        flipkart.isAvaliableForUsers();
//
//        WebApplications webApplications1=new Zomato();
//        webApplications1.check();
//        webApplications1.typeOfApplication();
//        webApplications1.response();
//        webApplications1.request();
//
//        System.out.println("////////////////////////////////////////////////////");
//        Zomato zomato=new Zomato();
//        zomato.isAvaliableinAllCities();

//        ServerSide serverSide=new Flipkart();
//        serverSide.request();

        Flipkart flipkart=new Myntra();
        flipkart.check();
        flipkart.request();
        flipkart.isAvaliableForUsers();
        flipkart.response();
        flipkart.typeOfApplication();

        System.out.println("////////////////////////////////////////////");
        Myntra myntra=new Myntra();
        myntra.apperalsForEveryGender();;


    }
}
