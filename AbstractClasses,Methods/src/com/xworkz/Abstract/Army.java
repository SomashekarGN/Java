package com.xworkz.Abstract;

public abstract class Army {

    private int size;

    public Army()
    {
        System.out.println("No args Const...!");
    }
    public  Army(int size)
    {
        this.size=size;
    }
    public void protectBorder(){
        System.out.println("Army Protects Border...!");
    }
    public abstract void useDrone();

    @Override
    public String toString() {
        return "Army{" +
                "size=" + size +
                '}';
    }
}
