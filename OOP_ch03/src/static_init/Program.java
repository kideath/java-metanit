/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package static_init;

public class Program{
      
    public static void main(String[] args) {
         
        Person tom = new Person();
        Person bob = new Person();
         
        tom.displayId();    // Id = 105
        bob.displayId();    // Id = 106
    }
}
class Person{
     
    private int id;
    static int counter = 999;
     
    static{
        counter = 105;
        System.out.println("Static initializer");
    }
    Person(){
        id=counter++;
        System.out.println("Constructor");
    }
    public void displayId(){
     
        System.out.printf("Id: %d \n", id);
    }
}