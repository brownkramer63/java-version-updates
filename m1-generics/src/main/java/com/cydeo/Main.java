package com.cydeo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> items = new ArrayList(); //ArrayList only accepts objects belongs to Integer claass

        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
//        items.add("Apple");

        printDoubled(items);

        System.out.println("------------------------------");

        FootballPlayer joe = new FootballPlayer("Joe");

        BaseballPlayer pat = new BaseballPlayer("Pat");

        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<SoccerPlayer> liverpool = new Team("Liverpool");

//        liverpool.addPlayer(joe);
//        liverpool.addPlayer(pat);
        liverpool.addPlayer(beckham);

















    }

    private static void printDoubled(ArrayList<Integer> items) {
        for (int each: items){
            System.out.println(each*2);

        }
    }
}
