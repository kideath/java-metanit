/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestedd;

class Person{
     
    private String name;
    Account account;
 
    Person(String name, String password){
        this.name = name;
        account = new Account(password);
    }
    public void displayPerson(){
        System.out.printf("Person \t Name: %s \t Password: %s \n", name, account.password);
    }
 
    public class Account{
        private String password;
         
        Account(String pass){
            this.password = pass;
        }
        void displayAccount(){
            System.out.printf("Account Login: %s \t Password: %s \n", Person.this.name, password);
        }
    }
}