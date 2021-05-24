/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacee;

class Journal implements Printable {
 
    private String name;
  
    String getName(){
        return name;
    }
  
    Journal(String name){
          
        this.name = name;
    }
    public void print() {
        System.out.println(name);
    }  
}