package Cydeo;

public class Main {
    public static void main(String[] args) {
        System.out.println("How to access a constant");

        Currency c = Currency.DIME;

        System.out.println(c);

        System.out.println(Currency.PENNY);

        System.out.println("How to get all constants");

       Currency[] currencies = Currency.values();

        for (Currency currency: currencies
             ) {
            System.out.println(currency);
        }

        System.out.println("How to use switch case with enums");


        switch (Currency.PENNY){
            case PENNY:
                System.out.println("it is 1 cent");
                break;case NICKLE:
                System.out.println("it is 5 cents");
                break;case DIME:
                System.out.println("it is 10 cents");
                break;case QUARTER:
                System.out.println("it is 25 cents");
                break;
        }







    }
    private static void calculate(double x, double y, MathOperations e){
        switch (e){
            case ADD:
                System.out.println(x+y);
                break;case SUBTRACT:
                System.out.println(x-y);
                break;case DIVIDE:
                System.out.println(x/y);
                break;case MULTIPLE:
                System.out.println(x*y);
                break;



        }

    }
}
