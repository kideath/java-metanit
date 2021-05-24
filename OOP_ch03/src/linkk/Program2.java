/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkk;

/**
 *
 * @author rsroot
 */
public class Program2 {
    public static void main(String []args) {
        try{
            Book book = new Book("War and Peace", "Leo Tolstoy");
            Book book2 = book.clone();
            book2.setAuthor("Ivan Turgenev");
            System.out.println(book.getAuthor());
        }
        catch(CloneNotSupportedException ex){

            System.out.println("Cloneable not implemented");
        }
    }
}

class Book implements Cloneable{
 
    private String name;
    private Author author;
     
    public void setName(String n){ name=n;}
    public String getName(){ return name;}
     
    public void setAuthor(String n){ author.setName(n);}
    public String getAuthor(){ return author.getName();}
 
    Book(String name, String author){
         
        this.name = name;
        this.author = new Author(author);
    }
     
    public String toString(){
         
        return "Книга '" + name + "' (автор " +  author + ")";
    }
     
    public Book clone() throws CloneNotSupportedException{
     
        //return (Book) super.clone();
        Book newBook = (Book) super.clone();
        newBook.author=(Author) author.clone();
        return newBook;        
        
    }
}
 
class Author implements Cloneable{
 
    private String name;
     
    public void setName(String n){ name=n;}
    public String getName(){ return name;}
     
    public Author(String name){
     
        this.name=name;
    }
    
    public Author clone() throws CloneNotSupportedException{
     
        return (Author) super.clone();
    }    
}