/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfacee;

import static java.lang.System.out;

public class Program{
      
    public static void main(String[] args) {
             
        Book b1 = new Book("Java. Complete Referense.", "H. Shildt");
        b1.print();
        
        Printable printable = new Book("Java. Complete Reference", "H. Shildt");
        printable.print();      //  Java. Complete Reference (H. Shildt)
        printable = new Journal("Foreign Policy");
        printable.print();      // Foreign Policy     
        
        // Интерфейс не имеет метода getName, необходимо явное приведение
        String name = ((Journal)printable).getName();
        System.out.println(name);     
        
        Printable.read();
    }
}
interface Printable{
 
    
    
    void print();
    
    static void read(){
         
        System.out.println("Read printable");
    }    
    
//    default void print(){
//         
//        System.out.println("Undefined printable");
//    }    
}
class Book implements Printable{
  
    String name;
    String author;
  
    Book(String name, String author){
          
        this.name = name;
        this.author = author;
    }
      
    public void print() {
      
        out.printf("%s (%s) \n", name, author);
    }
}