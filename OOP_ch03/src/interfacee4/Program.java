/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacee4;

public class Program{
      
    public static void main(String[] args) {
          
        Printable printable = createPrintable("Foreign Affairs",false);
        printable.print();
              
        read(new Book("Java for impatients", "Cay Horstmann"));
        read(new Journal("Java Dayly News"));
    }
          
    static void read(Printable p){
              
        p.print();
    }
          
    static Printable createPrintable(String name, boolean option){
              
        if(option)
            return new Book(name, "Undefined");
        else
            return new Journal(name);
    }
}
interface Printable{
 
    void print();
}
class Book implements Printable{
  
    String name;
    String author;
  
    Book(String name, String author){
          
        this.name = name;
        this.author = author;
    }
      
    public void print() {
      
        System.out.printf("%s (%s) \n", name, author);
    }
}
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