/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericss;

import java.util.ArrayList;

public class Program{
      
    public static void main(String[] args) {
        {
            Account acc1 = new Account(2334, 5000); // id - число
            int acc1Id = (int)acc1.getId();
            System.out.println(acc1Id);

            Account acc2 = new Account("sid5523", 5000);    // id - строка
            System.out.println(acc2.getId());
        }

        {
            Account<String> acc1 = new Account<String>("2345", 5000);
            String acc1Id = acc1.getId();
            System.out.println(acc1Id);

            Account<Integer> acc2 = new Account<Integer>(2345, 5000);
            Integer acc2Id = acc2.getId();
            System.out.println(acc2Id);        
        }
        
        ArrayList<String> a = new ArrayList<>();
        ArrayList<Integer> ai = new ArrayList<>();
    }
}

class Account<T>{
     
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