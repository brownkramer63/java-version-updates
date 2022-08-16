package Com.Cydeo.AppleStrategyDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class MainApple {
    public static void main(String[] args) {

List<Apple> inventory = new ArrayList<>();

inventory.add(new Apple(300,Color.GREEN));
inventory.add(new Apple(100,Color.GREEN));
inventory.add(new Apple(30,Color.GREEN));
inventory.add(new Apple(200,Color.RED));

List<Apple> heavyApple= sortApples(inventory, new HeavyApple());
        System.out.println(heavyApple);

        List<Apple> greenApple= sortApples(inventory,new GreenApple());

//ApppleSorting weightApple = (Apple apple) -> apple.getWeight()>200;

    }

    private static List<Apple> sortApples(List<Apple> inventory, ApppleSorting sorting){

        List<Apple> result = new ArrayList<>();

        for (Apple apple: inventory){
            if (ApppleSorting.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }



}
