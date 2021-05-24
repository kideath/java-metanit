/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exeption_class;

/**
 *
 * @author rsroot
 */
public class Program {
    public static void main(String[] args){

        try{
            int result = Factorial.getFactorial(-6);
            System.out.println(result);
        }
        catch(FactorialException ex){

            System.out.println(ex.getMessage());
            System.out.println(ex.getNumber());
        }
    } 
}

class Factorial{
 
    public static int getFactorial(int num) throws FactorialException{
     
        int result=1;
        if(num<1) throw new FactorialException("The number is less than 1", num);
         
        for(int i=1; i<=num;i++){
             
            result*=i;
        }
        return result;
    }
}
 
class FactorialException extends Exception{
 
    private int number;
    public int getNumber(){return number;}
    public FactorialException(String message, int num){
     
        super(message);
        number=num;
    }
}

class SecondFactorialException extends FactorialException {
 
    private int number;
    public int getNumber(){return number;}
    public SecondFactorialException(String message, int num){
     
        super(message, num);
        number=num;
    }
}