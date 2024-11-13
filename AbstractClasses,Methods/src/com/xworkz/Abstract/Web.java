package com.xworkz.Abstract;

public abstract class Web {

    private String version;

    Web()
    {
        System.out.println("No args Const...!");
    }

    Web(String version){
        this.version=version;
    }

    public abstract void autoConnect();

    @Override
    public String toString() {
        return "Web{" +
                "version='" + version + '\'' +
                '}';
    }
}
