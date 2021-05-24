/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestedd3;

class Math{
 
    public static class Factorial{
     
        private int result;
        private int key;
         
        public Factorial(int number, int x){
             
            result=number;
            key = x;
        }
         
        public int getResult(){
            return result;
        }
         
        public int getKey(){
            return key;
        }
    }
     
    public static Factorial getFactorial(int x){
     
        int result=1;
        for (int i = 1; i <= x; i++){
         
            result *= i;
        }
        return new Factorial(result, x);
    }
}