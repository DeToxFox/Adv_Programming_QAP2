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
        // the reason we use this.balance = new Money(0) and not this.balance = balance is because we are creating a new object and not using the one that was passed in
        this.balance = new Money(0);
        this.creditLimit = limit;
        this.owner = newCardHolder;
    }

    // Getters only because for balance and credit limit are being set within the CreditCard class and the getter for person is being set in the Person class
    public Money getBalance() {
        return balance;
    }
    public Money getCreditLimit() {
        return creditLimit;
    }
    public Person getPersonals() {
        return owner;
    }

    // Methods for charge and payment are here in the CreditCard class because they are specific to the CreditCard class but call on the Money class to do the math
    // charge will take a new amount and add it to the balance using the Money class but run validation to make sure the amount is not greater than the credit limit
    public void charge(Money amount){
        if ((this.balance.add(amount).compareTo(creditLimit) > 0)){
            System.out.println("Charge was denied over the credit limit");
        } else {
            // I left out this.balance and the terminal printout was not correct
            // the reason you need this.balance is that you are calling the balance instance variable and not the balance parameter  that was passed in
            this.balance = balance.add(amount);
        }

//        if(balance.add(amount).compareTo(creditLimit) > 0){
//            System.out.println("Charge was denied over the credit limit");
//
//        } else {
//
//            this.balance = balance.add(amount);
//
//
//        }
    }

    // make payment will take the amount passed in as a payment or better known as a parameter and subtract it from the balance using the Money class
    public void payment(Money amount){
        this.balance = balance.subtract(amount);
    }
}

//      0       +   200      ==         1000
//      200     +   10.02    ==         1000
//      210     -   25    185
//      185     +   990  = 1174.98 == 1000
//if (balance.add(amount).compareTo(creditLimit) < 0){
//        this.balance = balance.add(amount);
//
//        }