package com.erhan.part_four.oop.your_first_account;

public class YourFirstAccount {
    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here

        Account ericAccount = new Account("Eric", 100.0);

        ericAccount.deposit(20.0);

        System.out.println(ericAccount);

    }
}
