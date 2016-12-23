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
    // datafield radius 
    double radius;     
    //default constructor
    TestSimpleCircle(){  
        
    }
    //constructor to get radius
    public TestSimpleCircle(double newRadius) {   
        this.radius = newRadius;
    }
    public static void main(String[] args) {
        //we can pass radius to constructor or setRadius method
        TestSimpleCircle circle1 = new TestSimpleCircle();
        circle1.setRadius(1);
        circle1.printDetails();
        TestSimpleCircle circle2 = new TestSimpleCircle(25);
        circle2.printDetails();
        TestSimpleCircle circle3 = new TestSimpleCircle(100);
        circle3.printDetails();
        TestSimpleCircle circle4 = new TestSimpleCircle(125);
        circle4.printDetails();   
    }
    //this method calculate Area of circle
    public double getArea(){  
        return Math.PI * Math.pow(radius, 2); 
    }
    //this method calculate primeter (محيط ) of circle
    public double getPriemeter(){ 
        return 2 * Math.PI * radius;
    }
    //this method to set radius to calculate Area And primeter after create object
    public void setRadius(double newRadius){
       radius = newRadius;
    }
    //print all result 
    public void printDetails(){
        System.out.println("Calculate Area and Priemter for Circle With Radius "+radius+" cm");
        System.out.println("Area      = "+getArea()+" cm^2");
        System.out.println("Priemeter = "+getPriemeter()+" cm");
        System.out.println("---------------------------------------------------------");
    }  
}
