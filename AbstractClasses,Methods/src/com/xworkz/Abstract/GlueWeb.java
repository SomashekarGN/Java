package com.xworkz.Abstract;

public class GlueWeb extends Web{
    @Override
    public void autoConnect() {
        System.out.println("Auto Connect connected...!");
    }

    public GlueWeb(String version)

    {
        super(version);
    }
}
