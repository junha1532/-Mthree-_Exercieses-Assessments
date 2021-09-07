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
public abstract class Shape {
    protected String color;
    protected double area;
    protected double perimeter;

    public Shape(String color) {
        this.color = color;

    }
    
    public String getColor() {
        return color;
    }
    
    public abstract double getArea();

    public abstract double getPerimeter();
}
