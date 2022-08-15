package Com.Cydeo.Apple;

public class MainApple {
    public static void main(String[] args) {


        MainApple sort1 = new MainApple();

        GreenApple greenApple= new GreenApple();
        HeavyApple heavyApple = new HeavyApple();

        sort1.applesorting(greenApple);
        sort1.applesorting(heavyApple);


    }
    private void applesorting(ApppleSorting apt){
        apt.applesort();
    }

}
