package com.cydeo.Tasks;

import java.util.Comparator;

public class DishTask {
    public static void main(String[] args) {

        //print all dish name that has less than 400 calories
        //print the length of the name of each dish
        //print three high caloric dish name (>300)
        // print all dish name that are below 400 calories in sorted
        System.out.println("---1----------");

        DishData.getAll().stream()
                .filter(i -> i.getCalories() <400)
                .map(Dish::getName)
                .forEach(System.out::println);

        System.out.println("------2---------------");

        DishData.getAll().stream()
                .map(t-> t.getName().length())
                .forEach(System.out::println);

        System.out.println("----3--------------");
        DishData.getAll().stream()
                .filter(i-> i.getCalories()>300)
                .map(Dish::getName)
                .limit(3)
                .forEach(System.out::println);

        System.out.println("--4-------"); //error on this one working now
        DishData.getAll().stream()
                .filter(i-> i.getCalories()<400)
                .sorted(Comparator.comparing(Dish::getCalories))
                .map(Dish::getName)
                .forEach(System.out::println);








    }
}
