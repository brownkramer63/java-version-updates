package Com.Cydeo.AppleStrategyDesignPattern;

public class HeavyApple implements ApppleSorting{


    public  boolean test(Apple apple) {
        return apple.getWeight()>200;
    }
}
