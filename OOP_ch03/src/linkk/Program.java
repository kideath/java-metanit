/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkk;

public class Program{
      
    public static void main(String[] args) {
        try{
            Person tom = new Person("Tom", 23);
            Person bob = tom.clone();
            bob.setName("Bob");
            tom.display();      // Person Tom
        }
        catch(CloneNotSupportedException ex){

            System.out.println("Clonable not implemented");
        }
    }
}

class Person implements Cloneable{
    private String name;
    private int age;
     
    Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    void setName(String name){
        this.name = name;
    }
    void setAge(int age){
        this.age = age;
    }
    void display(){
        System.out.printf("Person %s \n", name);
    }
     
    public Person clone() throws CloneNotSupportedException{
      
        return (Person) super.clone();
    }
}