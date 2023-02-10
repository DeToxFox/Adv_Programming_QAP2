package com.keyin.shape;
/*
 * Project: QAP2 Problem #2 The MyRectangle and MyPoint Classes
 * Course Name: Advanced Programming (Java)
 * Written by: David Turner
 * Due Date: Feb 10, 2023
 */

import com.keyin.point.MyPoint;

public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    // below is the default constructor and it calls the other constructor that takes in 4 ints using MyPoint
    public MyRectangle(int x1, int y1, int x2, int y2){
        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
    }

    // this constructor takes in 2 MyPoint objects created in the MyPoint class and assigns them to the instance variables
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight){
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    // Getters and Setters
    public MyPoint getTopLeft(){
        return topLeft;
    }
    public void setTopLeft(MyPoint topLeft){
        this.topLeft = topLeft;
    }

    public MyPoint getBottomRight(){
        return bottomRight;
    }
    public void setBottomRight(MyPoint bottomRight){
        this.bottomRight = bottomRight;
    }

    // create a method that can create the bottom left point by taking the x value of top left and the y value of bottom right
    public MyPoint getBottomLeft(){
        return new MyPoint(topLeft.getX(), bottomRight.getY());
    }
    public void setBottomLeft(MyPoint bottomLeft){
        this.bottomRight = bottomLeft;
    }

    // create a method that can create the top right point by taking the x value of bottom right and the y value of top left
    public MyPoint getTopRight(){
        return new MyPoint(bottomRight.getX(), topLeft.getY());
    }
    public void setTopRight(MyPoint topRight){
        this.topLeft = topRight;
    }

    public int getTopLeftX(){return topLeft.getX();
    }
    public void setTopLeftX(int topLeftX){
        topLeft.setX(topLeftX);
    }

    public int getTopLeftY(){
        return topLeft.getY();
    }
    public void setTopLeftY(int topLeftY){
        topLeft.setY(topLeftY);
    }

    public int getTopRightX(){
        return bottomRight.getX();
    }
    public void setTopRightX(int topRightX){
        bottomRight.setX(topRightX);
    }

    public int getTopRightY(){
        return topLeft.getY();
    }
    public void setTopRightY(int topRightY){
        topLeft.setY(topRightY);
    }

    public int getBottomRightX(){
        return bottomRight.getX();
    }
    public void setBottomRightX(int bottomRightX){
        bottomRight.setX(bottomRightX);
    }

    public int getBottomRightY(){
        return bottomRight.getY();
    }
    public void setBottomRightY(int bottomRightY){
        bottomRight.setY(bottomRightY);
    }

    public int getBottomLeftX(){
        return topLeft.getX();
    }
    public void setBottomLeftX(int bottomLeftX){
        topLeft.setX(bottomLeftX);
    }

    public int getBottomLeftY(){
        return bottomRight.getY();
    }
    public void setBottomLeftY(int bottomLeftY){
        bottomRight.setY(bottomLeftY);
    }

    // get both x and y for top left
    public int[] getTopLeftXY(){
        return topLeft.getXY();
    }
    public void setTopLeftXY(int topLeftX, int topLeftY){
        topLeft.setXY(topLeftX, topLeftY);
    }

    // get both x and y for bottom right
    public int[] getBottomRightXY(){
        return bottomRight.getXY();
    }
    public void setBottomRightXY(int bottomRightX, int bottomRightY){
        bottomRight.setXY(bottomRightX, bottomRightY);
    }

    public int[] getTopRightXY(){
        return new int[]{bottomRight.getX(), topLeft.getY()};
    }
    public void setTopRightXY(int topRightX, int topRightY){
        bottomRight.setX(topRightX);
        topLeft.setY(topRightY);
    }

    public int[] getBottomLeftXY(){
        return new int[]{topLeft.getX(), bottomRight.getY()};
    }
    public void setBottomLeftXY(int bottomLeftX, int bottomLeftY){
        topLeft.setX(bottomLeftX);
        bottomRight.setY(bottomLeftY);
    }

    // Methods
    // added in a method to get the length of the rectangle, passing it through an if statement to make sure the length is positive and if negative make sure it converts to positive
    public double getLength(){
        if (topLeft.getX() - getTopRight().getX() < 0){
            return getTopRight().getX() - topLeft.getX();
        } else {
            return topLeft.getX() - getTopRight().getX();
        }
    }

    // added in a method to get the width of the rectangle
    public double getWidth(){
        if (topLeft.getY() - getBottomLeft().getY() < 0){
            return getBottomLeft().getY() - topLeft.getY();
        } else {
            return topLeft.getY() - getBottomLeft().getY();
        }
    }

     public double getArea(){
        return (bottomRight.getX() - topLeft.getX()) * (topLeft.getY() - bottomRight.getY());
     }

     public double getPerimeter(){
         return 2 * ((bottomRight.getX() - topLeft.getX()) + (topLeft.getY() - bottomRight.getY()));
     }

    public String toString(){
        return "MyRectangle[topLeft=" + topLeft + ",bottomRight=" + bottomRight + "]";
    }
}
