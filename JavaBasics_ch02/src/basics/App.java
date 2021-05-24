package basics;

import java.math.BigDecimal;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        {
            // https://metanit.com/java/tutorial/2.1.php
            var x = 10;
            //x = "aaa"; // error
            System.out.println(x);  // 10

            long num = 2147483649L;

            int num111 = 0x6F; // 16-тиричная система, число 111
            int num8 = 010; // 8-ричная система, число 8
            int num13 = 0b1101; // 2-ичная система, число 13
        }
        
        {
            int x = 123_456;
            int y = 234_567__789;
            System.out.println(x);  // 123456
            System.out.println(y);  // 234567789            
        }
        
        char ch=102; // символ 'f'
        System.out.println(ch);
        
        // Текстовые блоки, которые появились в JDK15, позволяют упростить написание многострочного текста:
        String text =          """
                Вот мысль, которой весь я предан,
                Итог всего, что ум скопил.
                Лишь тот, кем бой за жизнь изведан,
                Жизнь и свободу заслужил.
                """;
        System.out.println(text);
        
        {
            int x=5;
            int y=6;
            System.out.printf("x=%d; y=%d \n", x, y);
            
//            %d число
//            %x: для вывода шестнадцатеричных чисел
//            %f: для вывода чисел с плавающей точкой
//            %e: для вывода чисел в экспоненциальной форме, например, 1.3e+01
//            %c: для вывода одиночного символа
//            %s: для вывода строковых значений
            String name = "Tom";
            int age = 30;
            float height = 1.7f;

            System.out.printf("Name: %s  Age: %d  Height: %.2f \n", name, age, height);
            

        }
        
        {
//            Scanner in = new Scanner(System.in);
//            System.out.print("Input a number: ");
//            int num = in.nextInt();
//
//            System.out.printf("Your number: %d \n", num);
//            in.close();            
        }   
        
        {
            // Следует отметить, что числа с плавающей точкой не подходят для финансовых и других вычислений, 
            // где ошибки при округлении могут быть критичными. Например:
           double d = 2.0 - 1.1;
           System.out.println(d);

           // В данном случае переменная d будет равна не 0.9, как можно было бы изначально предположить, 
           // а 0.8999999999999999. Подобные ошибки точности возникают из-за того, что на низком уровне 
           // для представления чисел с плавающей точкой применяется двоичная система, однако для числа 
           // 0.1 не существует двоичного представления, также как и для других дробных значений. 
           // Поэтому в таких случаях обычно применяется класс BigDecimal, который позволяет обойти подобные ситуации.           
           BigDecimal bd1 = new BigDecimal("2.0");
           BigDecimal bd2 = new BigDecimal("1.1");
           BigDecimal bd = bd1.subtract(bd2);
           System.out.println(bd);
        }
        
        {
            // ^ (логическое исключающее ИЛИ)
            int number = 45; // 1001 Значение, которое надо зашифровать - в двоичной форме 101101
            int key = 102; //Ключ шифрования - в двоичной системе 1100110
            int encrypt = number ^ key; //Результатом будет число 1001011 или 75
            System.out.println("Зашифрованное число: " +encrypt);

            int decrypt = encrypt ^ key; // Результатом будет исходное число 45
            System.out.println("Расшифрованное число: " + decrypt);            
            
            // ~ (логическое отрицание)
            byte a = 12;                 // 0000 1100     
            System.out.println(~a);     //  1111 0011   или -13            
        }
        
        {
            for(int i = 1; i < 3; i++)
            {
                switch (i)
                {
                    default:
                        System.out.printf("i = %d \n", i++);
                        break;
                }
                System.out.println(i);
            }            
        }
        
        {
            // foreach
            int[] array = new int[] { 1, 2, 3, 4, 5 };
            for (int i : array){

                System.out.println(i);
            }            
        }
        
        sum(1, 2, 3);           // 6
        sum(1, 2, 3, 4, 5);     // 15
        sum();                  // 0        
        
        System.out.println(fibonachi(7));
        
    }
    
    // Параметры переменной длины
    static void sum(int ...nums){
         
        int result =0;
        for(int n: nums)
            result += n;
        System.out.println(result);
    }    
    
    
    static int fibonachi(int n){
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        else{
            return fibonachi(n - 1) + fibonachi(n - 2);
        }
    }
    
}
