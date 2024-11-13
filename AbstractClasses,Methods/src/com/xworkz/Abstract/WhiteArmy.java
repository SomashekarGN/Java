package com.xworkz.Abstract;

public class WhiteArmy extends RedArmy{

   public WhiteArmy(int size)
   {
       super(size);
   }


    @Override
    public void useBrahmos() {
        System.out.println("White Army Complete Brahmos...!");
    }

    @Override
    public void useDrone() {
        System.out.println("White Army Complete useDrone...!");
    }
}
