/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacee3;

interface Printable {
     
    // методы интерфейса
}
 
interface Searchable {
     
    // методы интерфейса
}
 
class BookEx implements Printable, Searchable{
 
    // реализация класса
    public static void main(String[] args) {
        System.out.println("Hello A");
    }
}

//class Book2 implements Printable, Searchable{
// 
//    // реализация класса
//    public static void main(String[] args) {
//        System.out.println("Hello B");
//    }
//}