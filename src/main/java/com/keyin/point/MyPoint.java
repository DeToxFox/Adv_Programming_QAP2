package com.keyin.point;
/*
 * Project: QAP2 Problem #1 & #2 MyLine, MyRectangle and MyPoint Classes
 * Course Name: Advanced Programming (Java)
 * Written by: David Turner
 * Due Date: Feb 10, 2023
 */

// this is the MyPoint class shared by MyLine and MyRectangle

public class MyPoint {
    // below are the instance variables
    private int x;
    private int y;

    // below is the default constructor
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    // below is the constructor with parameters
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Setters and Getters
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // I had to add in a getXY method to return both x and y NOTE: I USED THE QUICK FIX TO ADD IN THE METHOD NOT SURE WHY RETURN TYPE IS NULL
    // this needs to return an array of ints
    public int[] getXY() {
        int[] xy = new int[2];
        xy[0] = this.x;
        xy[1] = this.y;
        return xy;
    }
//    public int[] getXY() {
//
//        return null;
//    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // below is the toString method to return both x and y
    public String toString(){
        return ("Coordinates of this point are (" + this.x + "," + this.y +")");
    }

    // below is the distance method to calculate the distance between two points
    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    // Distance from this point to the given instance of MyPoint using MyPoint as the parameter and another as the argument
    public double distance(MyPoint another) {
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    // Distance from this point to the origin (0,0), NOTE: ASK DR.M ABOUT THIS, HOW FROM THE DIAGRAM WOULD ONE KNOW HOW TO DO THIS?
    // SHOULD THIS METHOD HAVE this.x subtracted from 0 and this.y subtracted from 0 before the Math.sqrt? because the problem says to use the distance from this point to (0,0) but the diagram shows the distance from (0,0) to this point so I'm not sure how to do this.
    public double distance(){
        int xDiff = this.x;
        int yDiff = this.y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
}
