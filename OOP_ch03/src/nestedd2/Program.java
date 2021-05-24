/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestedd2;

public class Program{
      
    public static void main(String[] args) {
             
        Person tom = new Person("Tom");
        tom.setAccount("qwerty");
    }
}
class Person{
     
    private String name;
 
    Person(String name){
        this.name = name;
    }
     
    public void setAccount (String password){
         
        class Account{
             
            void display(){
                System.out.printf("Account Login: %s \t Password: %s \n", name, password);
            }
        }
        Account account = new Account();
        account.display();
    }
}