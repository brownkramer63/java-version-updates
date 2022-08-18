package com.cydeo;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

     //   Predicate<Integer> pred= (p) -> p%2==0 ? true : false;

       Calculate addition = (x, y) -> System.out.println(x+y);

       Calculator.findSum(4,4);

       Calculate s1 = (x,y) -> Calculator.findSum(4,3);

       Calculate s2 = Calculator::findSum;

       s2.calculate(5,9);

       Calculator obj = new Calculator();

       Calculate s3 = obj::findMultiply;

       Calculate s4 = new Calculator() ::findMultiply;

        BiFunction<String, Integer,String>  func = (str, i) -> str.substring(i);

        BiFunction<String, Integer, String> func2 = String:: substring;

        Function<Integer, Double> func3 = new MyClass()::method;
        BiFunction<MyClass, Integer,Double> b = MyClass::method;

        Consumer<Integer> display = i -> System.out.println(i);
        Consumer<Integer> display2 = System.out::println;

        //Functional Programming












    }

}
