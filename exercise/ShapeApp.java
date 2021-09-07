/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.basics.exercise;

/**
 *
 * @author junha
 */
public class ShapeApp {
    public static void main(String[] args) {
        Square sqr = new Square("blue", 4);
        System.out.println(sqr.getPerimeter());
        Rectangle rect = new Rectangle("Red", 4, 8);
        System.out.println(rect.getPerimeter());
        Triangle tri = new Triangle("Yellow", 4, 6, 8);
        System.out.println(tri.getPerimeter());
        Circle circ = new Circle("Orange", 7);
        System.out.println(circ.getPerimeter());
    }
}

class Square extends Shape{
    private double length;
    
    Square(String color, double length) {
        super(color);
        this.length = length;
        this.area = length * length;
        this.perimeter = length * 4;
    }

    @Override
    public double getArea() {
        return this.area; 
    }

    @Override
    public double getPerimeter() {
        return this.perimeter;
    }
    
} 

class Rectangle extends Shape{
    private double width;
    private double height;
    
    Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
        this.area = width * height;
        this.perimeter = width * 2 + height * 2;
    }

    @Override
    public double getArea() {
        return this.area; 
    }

    @Override
    public double getPerimeter() {
        return this.perimeter;
    }
    
} 

class Triangle extends Shape{
    private double side1;
    private double side2;
    private double side3;
    
    Triangle(String color, double side1, double side2, double side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.perimeter = side1 + side2 + side3;
        //Heron's formula
        double s = perimeter / 2;
        this.area = Math.sqrt( s * (s-side1) * (s-side2) * (s-side3) );
    }

    @Override
    public double getArea() {
        return this.area; 
    }

    @Override
    public double getPerimeter() {
        return this.perimeter;
    }
    
} 

class Circle extends Shape{
    private double radius;
    
    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
        this.perimeter = 2 * Math.PI * radius;
        this.area = Math.PI * Math.sqrt(radius);
    }

    @Override
    public double getArea() {
        return this.area; 
    }

    @Override
    public double getPerimeter() {
        return this.perimeter;
    }
    
} 
