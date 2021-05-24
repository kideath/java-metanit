/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obobshenniy_nasledovanie;

/**
 *
 * @author rsroot
 */
public class Program {
    public static void main(String []args) {
        DepositAccount<Integer> depAccount = new DepositAccount(10);
        Account<Integer> account = (Account<Integer>)depAccount;
        System.out.println(account.getId());        
    }
}

class Account<T>
{
    private T _id;
    T getId(){return _id;}
    Account(T id)
    {
        _id = id;
    }
}
 
class DepositAccount<T> extends Account<T>{
 
    DepositAccount(T id){
        super(id);
    }
}