package com.keyin.qap2;

import com.keyin.creditcard.CreditCard;
import com.keyin.creditcard.Money;
import com.keyin.creditcard.Person;
import com.keyin.creditcard.Address;

/*
 * Project: QAP2 Problem #3 Credit Card, Money, Person and Address Classes
 * Course Name: Advanced Programming (Java)
 * Written by: David Turner
 * Due Date: Feb 10, 2023
 */

public class CreditCardDemo {
    // main method
    public static void main(String[] args) {
        // create a new Money object called LIMIT and pass in the amount of $1000.00
        final Money LIMIT = new Money(1000.00);
        final Money FIRST_AMOUNT = new Money(200);
        final Money SECOND_AMOUNT = new Money(10.02);
        final Money THIRD_AMOUNT = new Money(25);
        final Money FOURTH_AMOUNT = new Money(990);

        Person owner = new Person("Christie", "Diane", new Address("237J Harvey Hall", "Menomonie", "WI", "54751"));
        CreditCard visa = new CreditCard(LIMIT, owner);
        System.out.println("\n" + visa.getPersonals());
        System.out.println("Balance : " + visa.getBalance());
        System.out.println("Credit Limit: " + visa.getCreditLimit() + "\n");

        System.out.println("Attempt to charge " + FIRST_AMOUNT);
        visa.charge(FIRST_AMOUNT);
        System.out.println("Balance : " + visa.getBalance() + "\n");

        System.out.println("Attempt to charge " + SECOND_AMOUNT);
        visa.charge(SECOND_AMOUNT);
        System.out.println("Balance : " + visa.getBalance() + "\n");

        System.out.println("Attempt to pay " + THIRD_AMOUNT);
        visa.payment(THIRD_AMOUNT);
        System.out.println("Balance : " + visa.getBalance() + "\n");

        System.out.println("Attempt to charge " + FOURTH_AMOUNT);
        visa.charge(FOURTH_AMOUNT);
        System.out.println("Balance : " + visa.getBalance() + "\n");
    }
}
