package Com.Cydeo.Apple;

public class HeavyApple implements ApppleSorting{

    @Override
    public boolean test(Apple apple) {
        return apple.getWeight()>200;
    }
}
