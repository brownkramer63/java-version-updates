package com.StreamsContinued;

import com.cydeo.Tasks.Dish;
import com.cydeo.Tasks.DishData;

import java.util.Arrays;
import java.util.List;

public class Reducing {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4,5,3,9);

        int result = numbers.stream().reduce(0,(a,b)-> a+b);

        System.out.println(result);

        int caltotal =DishData.getAll().stream()
                .map(Dish::getCalories)
                .reduce((a,b)-> a+b).get();
        System.out.println(caltotal);

      //Count
        long dishcount=DishData.getAll().stream().count();

        System.out.println(dishcount);
















    }
}
