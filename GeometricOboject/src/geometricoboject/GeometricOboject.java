/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometricoboject;

import java.util.Date;

/**
 *
 * @author Emad
 */
public class GeometricOboject {
private String color="White";
    private boolean filled;
    private java.util.Date dateCreated;
      
    public GeometricOboject(){
        dateCreated = new java.util.Date();
    }
    public GeometricOboject(String color,boolean filled){
        dateCreated = new java.util.Date();
        this.color = color ;
        this.filled = filled ;
        
    } 
    public String getColor(){
    return color;
    }
    public void  setColor(String color){
        this.color = color;
    }
    public boolean isFilled(){
        return filled;
    }
    public  void  setFilled (boolean Filled){
        this.filled = filled;
    }
    public java.util.Date getDateCreated(){
        return dateCreated;
    }
    public String toString(){
     return "created on " + dateCreated + "\ncolor: " + color + 
        " and filled: " + filled;   
    }
    
    public static void main(String[] args) {
        
        Circle circle2 = new Circle(15.0, "red", true);
        System.out.println("A circle        " + circle2.toString());
        System.out.println("The color is    " + circle2.getColor());
        System.out.println("The radius is   " + circle2.getRadius());
        System.out.println("The area is     " + circle2.getArea());
        System.out.println("The diameter is " + circle2.getDiemeter());

        Rectangle rectangle = new Rectangle(2, 4);
        System.out.println("\nA rectangle " + rectangle.toString());
        System.out.println("The area is "   + rectangle.getArea());
        System.out.println("The perimeter is " + rectangle.getPrimeter());
    }
    
}
