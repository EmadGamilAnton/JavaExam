/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsimplecircle;

/**
 *
 * @author Emad
 */
public class TestSimpleCircle {
    
    double radius;
    TestSimpleCircle(){
        
    }
    public TestSimpleCircle(double newRadius) {
        this.radius = newRadius;
    }
    public static void main(String[] args) {
        TestSimpleCircle circle1 = new TestSimpleCircle(1);
        circle1.printDetails();
        TestSimpleCircle circle2 = new TestSimpleCircle(25);
        circle2.printDetails();
        TestSimpleCircle circle3 = new TestSimpleCircle(100);
        circle3.printDetails();
        TestSimpleCircle circle4 = new TestSimpleCircle(125);
        circle4.printDetails();   
    }
    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }
    public double getPriemeter(){
        return 2 * Math.PI * radius;
    }
    public void setRadius(double newRadius){
       radius = newRadius;
    }
    public void printDetails(){
        System.out.println("Calculate Area and Priemter for Circle With Radius "+radius+" cm");
        System.out.println("Area      = "+getArea()+" cm^2");
        System.out.println("Priemeter = "+getPriemeter()+" cm");
        System.out.println("---------------------------------------------------------");
    }  
}
