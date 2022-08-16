package Com.Cydeo.AppleStrategyDesignPattern.lambdaPractice;

import Com.Cydeo.AppleStrategyDesignPattern.Apple;
import Com.Cydeo.AppleStrategyDesignPattern.Color;

import java.util.ArrayList;
import java.util.List;

public class OrangeTest {

    public static void main(String[] args) {

        List<Orange> inventory = new ArrayList<>();

        inventory.add(new Orange(300, Color.GREEN));
        inventory.add(new Orange(100,Color.GREEN));
        inventory.add(new Orange(30,Color.GREEN));
        inventory.add(new Orange(200,Color.RED));

       OrangeFormatter orangeLambda= orange -> "An orange of "+orange.getWeight() + "g";
       //Flow

        prettyPrintApple(inventory,orangeLambda);


    }

    private static void prettyPrintApple(List<Orange> inventory, OrangeFormatter formatter){
        for (Orange orange: inventory){
            String output = formatter.test(orange);
            System.out.println(output);
        }
    }




}
