package com.cydeo.Tasks;

import java.util.Arrays;
import java.util.List;

public class Task1
{
    public static void main(String[] args) {

        int count =0;
        List<String> words = Arrays.asList("JAVA","APPLE","HONDA","DEVELOPER");
        words.stream()
                .map(i-> i.length())
                .forEach(System.out::println);



    }
}
