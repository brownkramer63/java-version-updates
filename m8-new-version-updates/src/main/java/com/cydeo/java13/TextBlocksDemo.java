package com.cydeo.java13;

public class TextBlocksDemo {
    public static void main(String[] args) {
        var address = "someones addess \n + end of address";
        System.out.println(address);

        var address2 = """
                this is a text block 
                does it split my code into different line?
                i think so 
                """;
        System.out.println(address2);
    }
}
