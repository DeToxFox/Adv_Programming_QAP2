package com.keyin.shape;
/*
 * Project: QAP2 Problem #1 The MyLine and MyPoint Classes
 * Course Name: Advanced Programming (Java)
 * Written by: David Turner
 * Due Date: Feb 10, 2023
 */

import com.keyin.point.MyPoint;

public class MyLine {
    // below are the instance variables
    private MyPoint begin;
    private MyPoint end;

    // the constructor below is used to create MyLine instance with the default begin and end points that are (0,0) and (1,1) and comes from the MyPoint class
    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);
    }
    // below is a constructor it takes the begin and end points from the above constructor and passes them in as parameters
    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }
    // Getters and Setters
    public MyPoint getBegin() {
        return begin;
    }
    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }
    public MyPoint getEnd() {
        return end;
    }
    public void setEnd(MyPoint end) {
        this.end = end;
    }
    // the reason return is begin.getX() is because the getX()
    // method is in the MyPoint class
    public int getBeginX() {
        return begin.getX();
    }
    public void setBeginX(int beginX) {
        begin.setX(beginX);
    }
    public int getBeginY() {
        return begin.getY();
    }
    public void setBeginY(int beginY) {
        begin.setY(beginY);
    }
    public int getEndX() {
        return end.getX();
    }
    public void setEndX(int endX) {
        end.setX(endX);
    }
    public int getEndY(){
        return end.getY();
    }
    public void setEndY(int endY){
        end.setY(endY);
    }
    public int[] getBeginXY(){
//        return this.getBeginXY();
        return begin.getXY();
    }
    public void setBeginXY(int beginX, int beginY){
        begin.setXY(beginX, beginY);
    }

    // get end xy by returning a 2 element int array of {x, y}
    public int[] getEndXY(){
        return end.getXY();
    }

    public void setEndXY(int endX, int endY){
        end.setXY(endX, endY);
    }
    // to use MyPoint's distance()
    public double getLength(){

        return begin.distance(end.getX(), end.getY());
    }

    // return the gradient in radians. Use Math.atan2(y, x) to get the angle
    public double getGradient(){
        return Math.atan2(end.getY() - begin.getY(), end.getX() - begin.getX());
    }


    public String toString(){
        return "MyLine[begin=" + begin + ", end=" + end + "]";
    }
}
