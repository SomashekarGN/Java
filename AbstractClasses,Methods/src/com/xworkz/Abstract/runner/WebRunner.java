package com.xworkz.Abstract.runner;

import com.xworkz.Abstract.GlueWeb;
import com.xworkz.Abstract.Web;

public class WebRunner {
    public static void main(String[] args) {
        Web web = new GlueWeb("2.0");
        web.autoConnect();
        //web.toString();

        System.out.println(web);
    }
}
