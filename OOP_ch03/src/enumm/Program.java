/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumm;

public class Program{
      
    public static void main(String[] args) {
          
        // Каждое перечисление имеет статический метод values(). Он возвращает массив всех констант перечисления:
        Type[] types = Type.values();
        for (Type s : types) { System.out.println(s); }
        
        // Метод ordinal() возвращает порядковый номер определенной константы (нумерация начинается с 0):
        System.out.println(Type.BELLETRE.ordinal());    // 1
    }
}
enum Type
{
    SCIENCE,
    BELLETRE,
    PHANTASY,
    SCIENCE_FICTION
}