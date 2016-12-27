/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometricoboject;

/**
 *
 * @author Emad
 */
public class Circle extends GeometricOboject{
    private double radius;
    
    Circle(){
        
    }
    Circle(double radius){
        this.radius = radius;
    }
    Circle(double radius,String color,boolean filled){
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getArea(){
        return Math.PI * radius * radius; 
    }
    public double getPriemeter(){
        return 2 * Math.PI * radius;
    }
    public double getDiemeter(){
        return 2 * radius;
    }
    public void printCircleInfo(){
        System.out.println("The Circle is created "+getDateCreated()+" and Radius is "+radius);
    }

}
