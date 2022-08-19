package com.cydeo;

import java.util.Arrays;
import java.util.List;

public class StreamOperators {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4);

        //list.forEach(x -> System.out.println(x));
        list.forEach(System.out::println);


        //FILTER
        System.out.println("filter-------------");

        list.stream()
                .filter(i -> i%2==0)
                .forEach(System.out::println);

        System.out.println("Distinct a new thing to do with streams");

        list.stream()
                .filter(i -> i%2==0)
                .distinct()
                .forEach(System.out::println);

        System.out.println("limit--------------");

        list.stream()
                .filter(i -> i%2==0)
                .limit(1)
                .forEach(System.out::println);

        System.out.println("map------------");// doing an action on each object that is left

        list.stream()
                .filter(i -> i%2==0)
                .map(i-> i*5)
                .forEach(System.out::println);


    }
}
