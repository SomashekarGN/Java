package com.xworkz.Abstract;

public abstract class RedArmy extends Army{

    RedArmy(int size)
    {
        super(size);
    }

    RedArmy()
    {
        System.out.println("Into RedArmy no args const...!");
    }

    public abstract void useBrahmos();
}
