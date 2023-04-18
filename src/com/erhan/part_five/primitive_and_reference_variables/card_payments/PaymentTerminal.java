package com.erhan.part_five.primitive_and_reference_variables.card_payments;

public class PaymentTerminal {

    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        // register initially has 1000 euros of money
        money = 1000;

    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double meal = 2.50;
        double change = 0;

        if (payment >= meal) {
            affordableMeals++;
            money = money + meal;
            change = payment - meal;

            return change;
        } else {
            return payment;
        }
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double meal = 4.30;
        double change = 0;

        if (payment >= meal) {
            heartyMeals++;
            money = money + meal;
            change = payment - meal;

            return change;
        } else {
            return payment;
        }
    }

    public boolean eatAffordably(PaymentCard card) {
        // an affordable meal costs 2.50 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned

        double meal = 2.50;

        if (card.balance() >= meal) {
            affordableMeals++;
            card.takeMoney(meal);
            return true;
        } else
            return false;

    }

    public boolean eatHeartily(PaymentCard card) {
        // a hearty meal costs 4.30 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        double meal = 4.30;

        if (card.balance() >= meal) {
            heartyMeals++;
            card.takeMoney(meal);
            return true;
        } else
            return false;

    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        // ...
        if ( sum > 0) {
            card.addMoney(sum);
            money+= sum;
        }
    }


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
