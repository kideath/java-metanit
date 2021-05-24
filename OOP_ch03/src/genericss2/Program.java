/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericss2;

public class Program{
      
    public static void main(String[] args) {
          
        Account<String> acc1 = new Account<>("1235rwr", 5000);
        Account<String> acc2 = new Account<>("2373", 4300);
        System.out.println(acc1.getId());
        System.out.println(acc2.getId());
    }
}
interface Accountable<T>{
    T getId();
    int getSum();
    void setSum(int sum);
}
class Account<T> implements Accountable<T>{
     
    private T id;
    private int sum;
     
    Account(T id, int sum){
        this.id = id;
        this.sum = sum;
    }
     
    public T getId() { return id; }
    public int getSum() { return sum; }
    public void setSum(int sum) { this.sum = sum; }
}