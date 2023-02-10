package com.keyin.qap2;
/*
 * Project: QAP2 Problem #2 The MyRectangle and MyPoint Classes
 * Course Name: Advanced Programming (Java)
 * Written by: David Turner
 * Due Date: Feb 10, 2023
 */

// test driver for MyRectangle class using MyPoint class to create the top left and bottom right points

import com.keyin.shape.MyRectangle;

public class TestMyRectangle {
    public static void main(String[] args) {
        // creating a rectangle instance variable representing just the top
        // left point and bottom right point coordinates
        MyRectangle rectangle1 = new MyRectangle(4, 6, 9, 2);

        // test and see if top left and bottom right points can be created and displayed
        System.out.println("\n" + "rectangle1.getTopLeft() = " + rectangle1.getTopLeft());
        System.out.println("rectangle1.getBottomRight() = " + rectangle1.getBottomRight() + "\n");

        // test top left x,y coordinates using the getTopLeftX() and getTopLeftY() methods
        System.out.println("rectangle1.getTopLeftX() = " + rectangle1.getTopLeftX());
        System.out.println("rectangle1.getTopLeftY() = " + rectangle1.getTopLeftY() + "\n");

        // test bottom right x,y coordinates using the getBottomRightX() and
        // getBottomRightY() methods
        System.out.println("rectangle1.getBottomRightX() = " + rectangle1.getBottomRightX());
        System.out.println("rectangle1.getBottomRightY() = " + rectangle1.getBottomRightY() + "\n");

        // test the toString() method to display this as a string "[(x1,y1),(x2,y2)]"
        System.out.println("rectangle1.toString() = " + rectangle1.toString() + "\n");

        // print out the bottom left point on the rectangle
        System.out.println("rectangle1.getBottomLeft() = " + rectangle1.getBottomLeft());
        // print out the top right point on the rectangle
        System.out.println("rectangle1.getTopRight() = " + rectangle1.getTopRight() + "\n");

        // test top left x,y coordinates using the getTopLeftX() and getTopLeftY() methods
        System.out.println("rectangle1.getBottomLeftX() = " + rectangle1.getBottomLeftX());
        System.out.println("rectangle1.getBottomLeftY() = " + rectangle1.getBottomLeftY() + "\n");

        // test bottom right x,y coordinates using the getBottomRightX() and
        // getBottomRightY() methods
        System.out.println("rectangle1.getTopRightX() = " + rectangle1.getTopRightX());
        System.out.println("rectangle1.getTopRightY() = " + rectangle1.getTopRightY() + "\n");

        // print out the length of the rectangle
        System.out.println("rectangle1.getLength() = " + rectangle1.getLength());

        // print out the width of the rectangle
        System.out.println("rectangle1.getWidth() = " + rectangle1.getWidth());

        // print out the area of the rectangle
        System.out.println("rectangle1.getArea() = " + rectangle1.getArea());

        // print out the perimeter of the rectangle
        System.out.println("rectangle1.getPerimeter() = " + rectangle1.getPerimeter() + "\n");
    }
}
