/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recordss;

import java.util.Objects;
 
public class Program{ 
       
    public static void main (String args[]){
           
        Person tom = new Person("Tom", 36);
        System.out.println(tom.toString());
    }
}
 
class Person {
    private final String name;
    private final int age;
 
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
 
    String name() { return name; }
    int age() { return age; }
 
    public boolean equals(Object o) {
        if (!(o instanceof Person)) return false;
        Person other = (Person) o;
        return other.name == name && other.age == age;
    }
 
    public int hashCode() {
        return Objects.hash(name, age);
    }
 
    public String toString() {
        return String.format("Person[name=%s, age=%d]", name, age);
    }
}