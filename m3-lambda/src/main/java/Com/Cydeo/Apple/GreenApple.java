package Com.Cydeo.Apple;

public class GreenApple implements ApppleSorting{

    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals(Color.GREEN);
    }
}
