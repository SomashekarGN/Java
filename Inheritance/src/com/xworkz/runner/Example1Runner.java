package com.xworkz.runner;

import com.xworkz.example1.*;

public class Example1Runner {
    public static void main(String[] args) {

        Person person=new Person();
        Person person1=new Employee();
        Person person2=new GovtEmployee();
        Person person3=new Player();
        Person person4=new StatePlayer();
        Person person5=new NationalPlayer();
        Person person6=new CricketPlayer();
        Person person7=new Bowler();

        System.out.println("/////////////////////////////////////////////////////////");

        Employee employee=new Employee();
        Employee employee1=new GovtEmployee();
        Employee employee2=new Player();
        Employee employee3=new StatePlayer();
        Employee employee4=new NationalPlayer();
        Employee employee5=new CricketPlayer();
        Employee employee6=new Bowler();

        System.out.println("/////////////////////////////////////////////////////////");

        GovtEmployee govtEmployee=new GovtEmployee();
        GovtEmployee govtEmployee1=new Player();
        GovtEmployee govtEmployee2=new StatePlayer();
        GovtEmployee govtEmployee3=new NationalPlayer();
        GovtEmployee govtEmployee4=new CricketPlayer();
        GovtEmployee govtEmployee5=new Bowler();

        System.out.println("/////////////////////////////////////////////////////////");

        Player player=new Player();
        Player player1=new StatePlayer();
        Player player2=new NationalPlayer();
        Player player3=new CricketPlayer();
        Player player4=new Bowler();

        System.out.println("/////////////////////////////////////////////////////////");

        StatePlayer statePlayer=new StatePlayer();
        StatePlayer statePlayer1=new NationalPlayer();
        StatePlayer statePlayer2=new CricketPlayer();
        StatePlayer statePlayer3=new Bowler();

        System.out.println("/////////////////////////////////////////////////////////");

        NationalPlayer nationalPlayer=new NationalPlayer();
        NationalPlayer nationalPlayer1=new CricketPlayer();
        NationalPlayer nationalPlayer2=new Bowler();

        System.out.println("/////////////////////////////////////////////////////////");

        CricketPlayer cricketPlayer=new CricketPlayer();
        CricketPlayer cricketPlayer1=new Bowler();

        System.out.println("/////////////////////////////////////////////////////////");

        Bowler bowler=new Bowler();

    }
}
