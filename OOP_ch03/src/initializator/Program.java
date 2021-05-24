/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package initializator;

public class Program{
      
    public static void main(String[] args) {
         
        Person undef = new Person();
        undef.displayInfo();
         
        Person tom = new Person("Tom");
        tom.displayInfo();
    }
}
class Person{
     
    String name;    // имя
    int age;        // возраст
     
    /*начало блока инициализатора*/
    {
        name = "Undefined";
        age = 18;
    }
    /*конец блока инициализатора*/
    Person(){
         
    }
    Person(String name){
         
        this.name = name;
    }
    Person(String name, int age){
         
        this.name = name;
        this.age = age;
    }
    void displayInfo(){
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }
}