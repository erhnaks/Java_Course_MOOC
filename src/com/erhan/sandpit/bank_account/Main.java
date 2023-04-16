package com.erhan.sandpit.bank_account;

public class Main {
    public static void main (String[] args) {

//        Account acc = new Account(435221344, 100);

//        acc.deposit();
//
//        System.out.println(acc.getAccountBalance());
//
//        System.out.println("=======================================");
//
//        acc.withdraw();
//
//        System.out.println(acc.getAccountTransactions());

        Customer eric = new Customer(134566, 1000, "Eric Johnson", 32, "Male");

        System.out.println(eric);

        eric.deposit();

    }
}
