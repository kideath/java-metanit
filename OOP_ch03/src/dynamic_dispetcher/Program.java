/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamic_dispetcher;

public class Program{
      
    public static void main(String[] args) {
             
        Person tom = new Person("Tom");
        tom.display();
        Person sam = new Employee("Sam", "Oracle");
        sam.display();
    }
}
class Person {
     
    private String name;
     
    public String getName() { return name; }
    
    public Person(String name){
     
        this.name=name;
    }
  
    public void display(){
         
        System.out.printf("Person %s \n", name);
    }
}
 
class Employee extends Person{
 
    private String company;
     
    public Employee(String name, String company) {
     
        super(name);
        this.company = company;
    }
    @Override
    public void display(){
         
        System.out.printf("Employee %s works in %s \n", super.getName(), company);
    }
}