package com.xworkz.Abstract;

public class LeelaHotel extends Hotel{
    @Override
    public void portableRoom() {
        System.out.println("Portable Rooms from Hotel Leela...!");
    }

    @Override
    public void advanceBooking() {
        System.out.println("Advance Booking of Hotel Leela...!");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
