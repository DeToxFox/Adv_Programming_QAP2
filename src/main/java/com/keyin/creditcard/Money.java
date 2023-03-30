package com.keyin.creditcard;

/*
 * Project: QAP2 Problem #3 Credit Card, Money, Person and Address Classes
 * Course Name: Advanced Programming (Java)
 * Written by: David Turner
 * Due Date: Feb 10, 2023
 */

public class Money {
// long is used because it is a 64 bit integer and will allow for larger numbers vs double will only allow for 15 digits
    // instance variables
    private long dollars;
    private long cents;

    // Constructor
    public Money(double Amount){
        long totalCents = Math.round(Amount * 100);
        this.cents = totalCents % 100;
        this.dollars = totalCents / 100;
    }

    // Copy Constructor
    // if another method wants to use this constructor it will pass in a Money object
    // and can be signified by the parameter otherObject or simply this because "this" is a
    // reference to the current object that this copy constructor is being called on
    public Money(Money otherObject) {
        this.dollars = otherObject.dollars;
        this.cents = otherObject.cents;
    }

    // Setters and Getters
    public void setDollars(long dollars) {
        this.dollars = dollars;
    }
    public long getDollars() {
        return dollars;
    }
    // make sure the cents are between 0 and 99 if not add or subtract dollars
    public void setCents(long cents){
        if (cents > 99){
            cents %= 100;
            setDollars(getDollars() + 1);
        } else if (cents <0){
            cents %= 100;
            setDollars(getDollars() - 1);
        }
        this.cents = cents;
    }
    public long getCents() {
        return cents;
    }

    // Other Methods
    // add money will take a new amount passed in from charge and add it to the balance
    public Money add(Money otherObject){
        // creating an add function that will not duplicate the code in the constructor
        // this will create a new object called newAmount that will be a copy of the current object
        Money newAmount = new Money(this);
        // this will add the new amount to the newAmount object
        newAmount.dollars += otherObject.dollars;
        newAmount.cents += otherObject.cents;
        // this will return the newAmount object
        return newAmount;
    }

    // subtract money will take a new amount passed in from payment and subtract it from balance
    public Money subtract(Money otherObject){
        this.dollars -= otherObject.dollars;
        this.cents -= otherObject.cents;
        return this;
    }

    // compareTo in this instance will compare the current object to the object being passed in
    public int compareTo(Money otherObject){
        /* the first condition checks if this.dollars is greater than otherObject.dollars and
        * if it is it returns 1 because this is greater than otherObject and if it is not it moves on to the next condition
        * this.dollars is the current object and otherObject.dollars is the object being passed in
        * it is not returning the value of this.dollars */

        if (this.dollars > otherObject.dollars){
            return 1;
        } else if (this.dollars < otherObject.dollars){
            return -1;
        } else if (this.cents > otherObject.cents){
            return 1;
        } else if (this.cents < otherObject.cents){
            return -1;
        } else {
            return 0;
        }
    }

    // equals method will compare the current object to the object being passed in for equality
    public boolean equals(Money otherObject) {
        if (this.dollars == otherObject.dollars && this.cents == otherObject.cents) {
            return true;
        } else {
            return false;
        }
    }

   // use a formatter for the toString method when it returns money based object using getDollars and getCents
    public String toString(){
        return String.format("$%d.%02d", this.dollars, this.cents);
    }
}
