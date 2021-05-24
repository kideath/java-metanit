package com.metanit;

public class Program{

    public static void main (String args[]){

        Person tom = new Person("Tom", 36, 80);
        System.out.println(tom.toString());
        Person bob = new Person("Tom", 36, 80);
        System.out.println(bob.toString());
        System.out.println(tom.equals(bob));



    }
}
record Person(String name, int age, int weight) { }