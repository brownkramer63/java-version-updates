package com.Cydeo;

import java.math.BigDecimal;

public class BigDecimalDemo {
    public static void main(String[] args) {

        double amount1 = 374.56;
        double amount2 = 374.26;
        System.out.println(amount1-amount2);

        BigDecimal b1 = new BigDecimal("374.56");
        BigDecimal b2 = new BigDecimal("374.26");
//        System.out.println(b1-b2); cannot do this because they are objects need a method
        System.out.println(b1.subtract(b2));//need this method
        //one more way to make big decimals
        BigDecimal b3 = BigDecimal.valueOf(345.33);
        

    }
}
class Employee{
    private String name;
    private BigDecimal salary;  }