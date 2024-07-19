package com.hyrTutorials.methods;

public class Bank {
    static int currentBankBalance = 1000;
    public static void greetCustomer(){
        System.out.println("Hello Customer !!! welcome to the bank");
    }
    public void deposit(int amount){
        currentBankBalance = currentBankBalance+amount;
        System.out.println("Amount deposited successfully");
    }
    public static void withdrawal(int amount){
        currentBankBalance = currentBankBalance-amount;
        System.out.println("Amount withdrawed successfully");
    }
    public int getCurrentBankBalance(){
        return currentBankBalance;
    }

    public static void main(String[] args){
        greetCustomer();
        Bank bank = new Bank();
        bank.deposit(100);
        withdrawal(50);
        System.out.println("Current bank balance is:"+bank.getCurrentBankBalance());
    }
}
