/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

import java.util.ArrayList;
 
public class Program{
      
    public static void main(String[] args) {
          
        ArrayList<String> people = new ArrayList<String>();
        // добавим в список ряд элементов
        people.add("Tom");
        people.add("Alice");
        people.add("Kate");
        people.add("Sam");
        people.add(1, "Bob"); // добавляем элемент по индексу 1
          
        System.out.println(people.get(1));// получаем 2-й объект
        people.set(1, "Robert1"); // установка нового значения для 2-го объекта
        people.set(1, "Robert2"); // установка нового значения для 2-го объекта
        people.set(1, "Robert3"); // установка нового значения для 2-го объекта
        people.set(1, "Robert4"); // установка нового значения для 2-го объекта
          
        System.out.printf("ArrayList has %d elements \n", people.size());
        for(String person : people){
          
            System.out.println(person);
        }
        // проверяем наличие элемента
        if(people.contains("Tom")){
          
            System.out.println("ArrayList contains Tom");
        }
          
        // удалим несколько объектов
        // удаление конкретного элемента
        people.remove("Robert"+4);
        // удаление по индексу
        people.remove(0);
          
        Object[] peopleArray = people.toArray();
        for(Object person : peopleArray){
          
            System.out.println(person);
        }
        
        System.out.println("capacity = " + people);
    }
}