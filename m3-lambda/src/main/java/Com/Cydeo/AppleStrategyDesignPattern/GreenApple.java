package Com.Cydeo.AppleStrategyDesignPattern;

public class GreenApple implements ApppleSorting{


    public boolean test(Apple apple) {
        return apple.getColor().equals(Color.GREEN);
    }
}
