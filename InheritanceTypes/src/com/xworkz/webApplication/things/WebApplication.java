package com.xworkz.webApplication.things;

import com.xworkz.webApplication.ClientSide;
import com.xworkz.webApplication.ServerSide;

public  class WebApplication implements ClientSide, ServerSide {
    @Override
    public void response() {
        System.out.println("Response for the Request...!");
    }

    @Override
    public void request() {
        System.out.println("Requested to the Server Waiting for the response...!");
    }

    public void typeOfApplication()
    {
        System.out.println("Type Of Application :");
    }
}
