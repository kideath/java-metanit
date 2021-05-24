/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oblectt;

public class Program{
      
    public static void main(String[] args) {
             
        Person tom = new Person("Tom");
        System.out.println(tom.toString()); // Будет выводить что-то наподобие Person@7960847b
        System.out.println(tom.hashCode()); // 2036368507
        System.out.println(tom.getClass()); // class Person
        
        //Person tom = new Person("Tom");
        Person bob = new Person("Bob");
        System.out.println(tom.equals(bob)); // false
         
        Person tom2 = new Person("Tom");
        System.out.println(tom.equals(tom2)); // true        
        System.out.println(tom == bob);  // false
        System.out.println(tom == tom2);  // false
    }
}
class Person {
     
    private String name;
     
    public Person(String name){
     
        this.name=name;
    }
    
    @Override
    public String toString(){
          
        return "Person " + name;
    }    
    
    @Override
    public int hashCode(){
 
        return 10 * name.hashCode() + 20456;
    }
    
    @Override
    public boolean equals(Object obj){
         
        if (!(obj instanceof Person)) return false;
 
        Person p = (Person)obj;
        return this.name.equals(p.name);
    }    

    
}