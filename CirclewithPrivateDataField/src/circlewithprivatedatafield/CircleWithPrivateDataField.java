/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circlewithprivatedatafield;

/**
 *
 * @author Emad
 */
public class CircleWithPrivateDataField {

    /**
     * @param args the command line arguments
     */
    
    //Static method can access static method only 
    //instance method or public or private can access static method 
  
    private double radius = 1;
    private static int numberOfObject = 0;

    CircleWithPrivateDataField() {

    }

    public CircleWithPrivateDataField(double radius) {

        this.radius = radius;
        numberOfObject++;
    }

    public static void main(String[] args) {
        CircleWithPrivateDataField c1 = new CircleWithPrivateDataField(5);
        System.out.println("Circle 1 radius is " + c1.radius + " and number of objects is " + numberOfObject);
        CircleWithPrivateDataField c2 = new CircleWithPrivateDataField(7);
        System.out.println("Circle 2 radius is " + c2.radius + " and number of objects is " + numberOfObject);
        CircleWithPrivateDataField c3 = new CircleWithPrivateDataField(10);
        System.out.println("Circle 3 radius is " + c3.radius + " and number of objects is " + numberOfObject);
    }
}
