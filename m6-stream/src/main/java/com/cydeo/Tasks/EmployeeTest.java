package com.cydeo.Tasks;

public class EmployeeTest {
    public static void main(String[] args) {

//print all emails
        EmployeeData.readAll()
                .map(i -> i.getEmpEmail())
                .forEach(System.out::println);



    }
}
