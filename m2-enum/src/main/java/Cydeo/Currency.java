package Cydeo;

public enum Currency {
PENNY(1),NICKLE(5),DIME(10),QUARTER(25);

int value;


    Currency(int value) {
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
