package com.keyin.creditcard;

/*
 * Project: QAP2 Problem #3 Credit Card, Money, Person and Address Classes
 * Course Name: Advanced Programming (Java)
 * Written by: David Turner
 * Due Date: Feb 10, 2023
 */

public class Address {

    // instance variables
    private String street;
    private String city;
    private String state;
    private String zip;

    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    // toString method that will return the address
    public String toString(){
        return street + " " + city + " " + state + " " + zip;
    }
}
