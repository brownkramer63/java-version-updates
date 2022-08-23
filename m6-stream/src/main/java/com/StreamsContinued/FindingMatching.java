package com.StreamsContinued;

import com.cydeo.Tasks.Dish;
import com.cydeo.Tasks.DishData;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindingMatching {
    //All Match
    public static void main(String[] args) {

        boolean ishealthy=DishData.getAll().stream().allMatch(dish-> dish.getCalories()<1000);
        //this is returning a boolean
        System.out.println(ishealthy);

        System.out.println("any match-----------------");
        if (DishData.getAll().stream().anyMatch(Dish::isVegetarian)){
            System.out.println("the menu is vegetarion friendly");
        }


        System.out.println("None Match--------------");

        boolean isHealthy2 = DishData.getAll().stream().noneMatch(dish->dish.getCalories()>=1000);
        System.out.println(isHealthy2);

        System.out.println("Find any------------------------");

        Optional<Dish> dish = DishData.getAll().stream().filter(Dish::isVegetarian).findAny(); // will find any give a random
        System.out.println(dish.get());

        //optional class ozzy will explain tomorrow when i am gone lol

        System.out.println("find first---------------------");

        Optional<Dish> dish2 = DishData.getAll().stream().filter(Dish::isVegetarian).findFirst();
        System.out.println(dish2.get());

        //Parallel streams async

        List<String> list1 = Arrays.asList("Johnny","KRamer","Ozzy","Duke","Dany");
        List<String> list2 = Arrays.asList("Johnny","KRamer","Ozzy","Duke","Dany");

        System.out.println("Findfirst example");
      Optional<String> findFirst=  list1.parallelStream().filter(s-> s.startsWith("D")).findFirst();
        System.out.println(findFirst);
        System.out.println("Findany");
      Optional<String> findAny=  list1.parallelStream().filter(s-> s.startsWith("J")).findAny();
        System.out.println(findAny);

        //Min and Max
        System.out.println("min");
        Optional<Dish> dmin=DishData.getAll().stream().min(Comparator.comparing(Dish::getCalories));
        System.out.println(dmin);

        System.out.println("Max");
        Optional<Dish> dmax=DishData.getAll().stream().max(Comparator.comparing(Dish::getCalories));
        System.out.println(dmax);












    }

}
