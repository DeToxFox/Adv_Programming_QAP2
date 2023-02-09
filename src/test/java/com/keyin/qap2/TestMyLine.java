package com.keyin.qap2;
/*
 * Project: QAP2 Problem #1 The MyLine and MyPoint Classes
 * Course Name: Advanced Programming (Java)
 * Written by: David Turner
 * Due Date: Feb 10, 2023
 */

// Test all the public methods in the MyLine class only, these methods are the ones that are not in the
// MyPoint class and are by name: getBegin(), getEnd(), getBeginX(), getBeginY(), getEndX(), getEndY(),
// setBeginX(int x), setBeginY(int y), setEndX(int x), setEndY(int y), getLength(), getGradient(), toString()

import com.keyin.shape.MyLine;
import java.util.Arrays;

public class TestMyLine {
    public static void main(String[]args){
        // create a MyLine instance with the default begin and end points that are (0,0) and (1,1) and the points are from the MyPoint class passed in as parameters in the MyLine class constructor and tested in the TestMyLine class
        MyLine line1 = new MyLine(1,1,2,2);

        // test the getBegin() method
        System.out.println("line1.getBegin() = " + line1.getBegin());

        // test the getEnd() method
        System.out.println("line1.getEnd() = " + line1.getEnd());

        // test the getBeginX() method
        System.out.println("line1.getBeginX() = " + line1.getBeginX());

        // test the getBeginY() method
        System.out.println("line1.getBeginY() = " + line1.getBeginY());

        // test the getEndX() method
        System.out.println("line1.getEndX() = " + line1.getEndX());

        // test the getEndY() method
        System.out.println("line1.getEndY() = " + line1.getEndY());

        // test the setBeginX(int x) method
        line1.setBeginX(1);
        System.out.println("line1.setBeginX(1) = " + line1.getBeginX());

        // test the setBeginY(int y) method
        line1.setBeginY(1);
        System.out.println("line1.setBeginY(1) = " + line1.getBeginY());

        // test the setEndX(int x) method
        line1.setEndX(2);
        System.out.println("line1.setEndX(2) = " + line1.getEndX());

        // test the setEndY(int y) method
        line1.setEndY(2);
        System.out.println("line1.setEndY(2) = " + line1.getEndY());

        // test the getLength() method
        System.out.println("line1.getLength() = " + line1.getLength());

        // test the getGradient() method
        System.out.println("line1.getGradient() = " + line1.getGradient());

        // test the toString() method sending begin and end to the toString() method in the MyPoint class
        System.out.println("line1.toString() = " + line1.toString());


        // test get beginXY and endXY
        System.out.println("line1.getBeginXY() = " + (Arrays.toString(line1.getBeginXY())));
//        System.out.println("line1.getEndXY() line 63= " + line1.getEndXY());
    }
}
