package com.erhan.sandpit.bank_account;

public class Main {
    public static void main (String[] args) {

        Account acc = new Account(435221344, 100);

        acc.deposit();

        System.out.println(acc.getAccountBalance());

        System.out.println("=======================================");

        acc.withdraw();


    }
}
