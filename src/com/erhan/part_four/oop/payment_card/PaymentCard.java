package com.erhan.part_four.oop.payment_card;

public class PaymentCard {
    private double balance;


    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public String toString() {
        return "The card has a balance of " + balance + " euros";
    }

    public void eatAffordably() {
        // write code here
        if (this.balance >= 2.60)
            this.balance -= 2.60;

    }

    public void eatHeartily() {
        // write code here
        if (this.balance >= 4.60)
            this.balance -= 4.60;
    }

    public void addMoney(double amount) {
        // write code here
        if (amount + this.balance > 150) {
            this.balance = 150;
        } else if (amount <= 0) {
            return;
        } else {
            this.balance += amount;
        }
    }
}
