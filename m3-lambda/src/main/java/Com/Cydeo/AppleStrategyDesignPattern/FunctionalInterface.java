package Com.Cydeo.AppleStrategyDesignPattern;

import Com.Cydeo.AppleStrategyDesignPattern.ApppleSorting;

import java.util.function.*;


public class FunctionalInterface {
    public static void main(String[] args) {

       ApppleSorting ap = new ApppleSorting(){
           public boolean test(Apple apple){
               return apple.getWeight()>200;
           }
       };

       //predicate
        System.out.println("predicate-------------------------");

        Predicate<Integer> lesserThan =  i -> i<18;
        System.out.println(lesserThan.test(20));

        //consumer

        System.out.println("consumer-----------------------");

        Consumer<Integer> display = i -> System.out.println(i);

        display.accept(10);

        System.out.println("BiConsumer---------------------------");

        BiConsumer<String,String> addStrings = (x,y) ->System.out.println(x+y);
        addStrings.accept("kram","er");

        System.out.println("Function------------------------");
        Function<String,String> fun = s -> "Hello "+s;
        System.out.println(fun.apply("Ozzy"));

        System.out.println("bifunction-------------------");
        BiFunction<Integer,Integer,Integer> func = (x1, x2) ->x1+x2;
        System.out.println(func.apply(2,3));

        System.out.println("Supplier----------------");
        Supplier<Double> randomvalue = () -> Math.random();
        System.out.println(randomvalue.get());
    }
        }


