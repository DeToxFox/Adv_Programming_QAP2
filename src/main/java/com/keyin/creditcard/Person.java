package com.keyin.creditcard;

/*
 * Project: QAP2 Problem #3 Credit Card, Money, Person and Address Classes
 * Course Name: Advanced Programming (Java)
 * Written by: David Turner
 * Due Date: Feb 10, 2023
 */
public class Person {

     // instance variables
    private String lastName;
    private String firstName;
    private Address home;

    public Person(String lastName, String firstName, Address home) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.home = home;
    }

    // toString method that will return first and last name and home address
    public String toString(){
        return firstName + " " + lastName + " " + home;
    }
}
