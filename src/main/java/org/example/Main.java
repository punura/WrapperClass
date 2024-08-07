package org.example;

public class Main {
    public static void main(String[] args) {

        Boolean b = new Boolean("true"); // true
        Boolean b1 = new Boolean(true); // true
        System.out.println(b.equals(b1)); //true or false = true

        Boolean b2 = new Boolean("True"); // true -- bcz of case insensitive
        Boolean b3 = new Boolean("tRue"); // true -- bcz of case insensitive
        System.out.println(b1.equals(b3)); // true or false = true

        Boolean b4 = new Boolean("hey"); // false
        Boolean b5 = new Boolean("Bye"); // false
        System.out.println(b4.equals(b5)); // true or false = true

        Boolean b6 = new Boolean("hello"); // false
        Boolean b7 = new Boolean(false); // false
        System.out.println(b6.equals(b7)); // true

    }
}