package com.keyin.qap2;
/*
 * Project: QAP2 Problem #2 The MyRectangle and MyPoint Classes
 * Course Name: Advanced Programming (Java)
 * Written by: David Turner
 * Due Date: Feb 10, 2023
 */

// test driver for MyRectangle class using MyPoint class to create the top left and bottom right points
// ultimatey MyPoint is only used to create the points needed in the MyRectangle class and
//TestMyRectangle class is used to test the MyRectangle class

public class TestMyRectangle {
    public static void main(String[] args) {
        // creating a rectangle instance variable representing just the top
        // left point and bottom right point coordinates
        MyRectangle rectangle1 = new MyRectangle(4, 6, 9, 2);

        // test and see if top left and bottom right points can be created and displayed
        System.out.println("rectangle1.getTopLeft() = " + rectangle1.getTopLeft());
        System.out.println("rectangle1.getBottomRight() = " + rectangle1.getBottomRight());

        // test top left x,y coordinates using the getTopLeftX() and getTopLeftY() methods
        System.out.println("rectangle1.getTopLeftX() = " + rectangle1.getTopLeftX());
        System.out.println("rectangle1.getTopLeftY() = " + rectangle1.getTopLeftY());

        // test bottom right x,y coordinates using the getBottomRightX() and
        // getBottomRightY() methods
        System.out.println("rectangle1.getBottomRightX() = " + rectangle1.getBottomRightX());
        System.out.println("rectangle1.getBottomRightY() = " + rectangle1.getBottomRightY());

        // test the toString() method to display this as a string "[(x1,y1),(x2,y2)]"
        System.out.println("rectangle1.toString() = " + rectangle1.toString());

    }
}
