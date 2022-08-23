package com.Cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(2,4,2,10,23);

        Optional<String> empty = Optional.empty();
        System.out.println(empty);

        System.out.println(empty.isPresent()); //would return true if something was inside

        System.out.println(Optional.of(number).isPresent());

        //ifpresent
       Optional<Integer> bignumber=number.stream().filter(x -> x > 100).findAny();

//        System.out.println(empty.get());



    }
}
