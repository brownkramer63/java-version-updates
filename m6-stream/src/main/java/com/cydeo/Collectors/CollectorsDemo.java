package com.cydeo.Collectors;

import com.cydeo.Tasks.Dish;
import com.cydeo.Tasks.DishData;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {
        //tocollection supplier : is used to creat a collection using collector

        List<Integer> numbers = Arrays.asList(2,3,4,5,6,6,7);

        List<Integer> numberlist=numbers.stream()
                .filter(x-> x%2==0)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(numberlist);

        Set<Integer> numberSet = numbers.stream()
                .filter(x-> x%2==0)
                .collect(Collectors.toCollection(HashSet::new));

        System.out.println(numberSet);

        //tolist() returns a collector interface that gathers the input data into a new list

        List<Integer> numberlist2 =numbers.stream()
                .filter(x-> x%2==0)
                .collect(Collectors.toList());

        Set<Integer> numberset2 = numbers.stream()
                .filter(x-> x%2==0)
                .collect(Collectors.toSet());

        //toMap (function , function ):returns a collector interface that gathers the input data into a new map

        Map<String,Integer> dishmap=DishData.getAll().stream()
                .collect(Collectors.toMap(Dish::getName,Dish::getCalories));
        System.out.println(dishmap);

        // summingInt(ToIntFunction) : returns a collector that produces the sum of a Integer-valued function

        int sumofdish= DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));
        System.out.println(sumofdish);

        //counting(): returns a colelctor that count the number of the elements

        Long evencount = DishData.getAll().stream()
                .collect(Collectors.counting());
        System.out.println(evencount);

        //averagingint(toIntFunction): returns the average oft he integers passed values

       Double averageofdishes= DishData.getAll().stream()
                .collect(Collectors.averagingInt(Dish::getCalories));
        System.out.println(averageofdishes);


        //joining() : is uesd to join various elements of a character or string array into a single object

        List<String> course = Arrays.asList("Java","Java2","JS");
       String str= course.stream()
                .collect(Collectors.joining(","));
        System.out.println(str);

Map<Boolean,List<Dish>>  listing=      DishData.getAll().stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));
        System.out.println(listing);




    }
}
