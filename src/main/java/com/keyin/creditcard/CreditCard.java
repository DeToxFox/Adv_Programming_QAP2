package com.keyin.creditcard;
import com.keyin.creditcard.Money;

/*
 * Project: QAP2 Problem #3 Credit Card, Money, Person and Address Classes
 * Course Name: Advanced Programming (Java)
 * Written by: David Turner
 * Due Date: Feb 10, 2023
 */

public class CreditCard {
    // instance variables
    private Money balance;
    private Money creditLimit;
    private Person owner;

    // Constructor
    public CreditCard(Money limit, Person newCardHolder){
        // the reason we use this.balance = new Money(0) and not this.balance = balance
        // is because we are creating a new object and not using the one that was passed in
        this.balance = new Money(0);
        this.creditLimit = limit;
        this.owner = newCardHolder;
    }

    // Getters only because for balance and credit limit are being set
    // within the CreditCard class and the getter for person is being
    // set in the Person class
    public Money getBalance() {
        return balance;
    }
    public Money getCreditLimit() {
        return creditLimit;
    }
    public Person getPersonals() {
        return owner;
    }

    // Methods for charge and payment are here in the CreditCard class because they are specific to the CreditCard class but call on the Money class to does the math
    // charge will take a new amount and add it to the balance using the Money class but run validations to make sure the amount is not greater than the credit limit
    public void charge(Money amount){
        if ((this.balance.add(amount).compareTo(creditLimit) > 0)){
            System.out.println("Charge was denied over the credit limit");
        } else {
            this.balance = balance.add(amount);
        }
    }

    // make payment will take the amount passed in as a payment or
    // better known as a parameter and subtract it from the balance using the Money class
    public void payment(Money amount){
        this.balance = balance.subtract(amount);
    }
}