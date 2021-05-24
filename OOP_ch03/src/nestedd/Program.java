/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestedd;

public class Program{
      
    public static void main(String[] args) {
             
        Person tom = new Person("Tom", "qwerty");
        tom.displayPerson();
        tom.account.displayAccount();
        
        Person.Account acc; // = new 
        // acc = new Person.Account("asd");
    }
}
