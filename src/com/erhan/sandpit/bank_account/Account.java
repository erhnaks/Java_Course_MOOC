package com.erhan.sandpit.bank_account;

import java.util.Scanner;

public class Account {

    private int accountNumber;
    private int accountBalance;
    private int accountTransactions;


    public Account(Integer accountNumber, Integer accountBalance) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.accountTransactions = 0;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public int getAccountBalance() {
        return this.accountBalance;
    }

    public int getAccountTransactions() {
        return this.accountTransactions;
    }

    public void deposit() {
        Scanner scan = new Scanner(System.in);
        System.out.println("How much would you like to deposit? ");

        int amount = scan.nextInt();
        int count = 0;

        if (amount > 0) {
            this.accountBalance += amount;
            count++;
        } else {
            System.out.println("Deposit amount must be greater than 0.00");
        }
        this.accountTransactions = count;
        System.out.println(this.accountBalance);
    }

    public int withdraw(){
        int count = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("How much would you like to withdraw? ");
        int amount = scan.nextInt();

        if (this.accountBalance >= amount) {
            this.accountBalance -= amount;
            System.out.println("Your new balance is: " + this.getAccountBalance() );
            count++;
        } else {
            System.out.println("You do not have enough balance: " + this.getAccountBalance());
        }
            this.accountTransactions = count;
            return this.accountBalance;
    }

//    public String depositToString(){
//        return "You have deposited " + this.deposit() + ". Your new balance is: " + this.getAccountBalance();
//    }

    public String withdrawToString(){
        return "You have withdrawn " + this.withdraw() + ", Your new balance is: " + this.getAccountBalance();
    }

//    public String toString(){
//
//    }


}
