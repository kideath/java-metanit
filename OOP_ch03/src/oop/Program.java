/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

public class Program{
      
    public static void main(String[] args) {
         
//        Person tom;
//        if (tom == null) {
//            System.out.println("tom is null");
//        }
        Person tom = new Person(); // создание объекта
        tom.displayInfo();
        System.out.println(tom);
         
        // изменяем имя и возраст
        tom.name = "Tom";
        tom.age = 34;
        tom.displayInfo();
        System.out.println(tom);
        

        

    }
}

class Person{
     
    String name;    // имя
    int age;        // возраст
    void displayInfo(){
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }
}