package com.xworkz.Abstract;

public abstract class Hotel {


    public void service()
    {
        System.out.println("Service in hotel....!");
    }

    public void advanceBooking()
    {
        System.out.println("Advance Booking in hotel");
    }

    public abstract void portableRoom();


    @Override
    public String toString() {
        return super.toString();
    }
}
