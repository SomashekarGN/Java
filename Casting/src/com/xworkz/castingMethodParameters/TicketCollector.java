package com.xworkz.castingMethodParameters;

public class TicketCollector extends PublicServant{

    @Override
    public void protectIPC() {
        System.out.println("Ticket collector protects IPC section()...");
    }

    public void checkTicket()
    {
        System.out.println("Ticket Collector checks Tickets...");
    }
}
