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
public class Rectangle extends GeometricOboject {
    private double width;
    private double height;

    public Rectangle() {
    }
    
    public Rectangle (double width,double height){
        this.width = width;
        this.height = height;
    }
    public Rectangle(double width,double height,String color,boolean filled){
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        
    }
    public double getArea(){
        return width * height;
    }
    public double getPrimeter(){
        return 2 * (width+height);
    }
}
