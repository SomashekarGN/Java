package com.xworkz.Abstract.runner;

import com.xworkz.Abstract.AshokHotel;
import com.xworkz.Abstract.Hotel;
import com.xworkz.Abstract.LeelaHotel;

public class HotelRunner {
    public static void main(String[] args) {
        LeelaHotel leelaHotel=new LeelaHotel();
        leelaHotel.portableRoom();
        leelaHotel.advanceBooking();
        leelaHotel.service();
        System.out.println(leelaHotel);

        AshokHotel ashokHotel=new AshokHotel();
        ashokHotel.portableRoom();
        ashokHotel.service();
        ashokHotel.advanceBooking();
        System.out.println(ashokHotel);
    }
}
