package com.cydeo;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CArTest {
    public static void main(String[] args) {
        //zero arg constructor
        Supplier<Car> c1 = () -> new Car();

        System.out.println(c1.get().getModel());

        Supplier<Car> c2 = Car:: new;

        System.out.println(c2.get().getModel());

        //One Argument constructor

        Function<Integer, Car> car1 = model -> new Car(model);

        //two argument constructor
        BiFunction<String, Integer,Car> a1 = Car::new;





    }
}
