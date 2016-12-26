/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sheet1_3;

import java.util.Scanner;

/**
 *
 * @author Emad Gamil Anton
 */
public class Sheet1_3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        QuadraticEquation equation = new QuadraticEquation(s.nextDouble(),
                s.nextDouble(), s.nextDouble());
        double discriminant = equation.getDiscriminant();
        if (discriminant > 0) {
            System.out.println("The roots are " + equation.getRoot1()
                    + " and " + equation.getRoot2());
        } else if (discriminant == 0) {
            System.out.println("The root is " + equation.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}

class QuadraticEquation {

    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return Math.pow(b, 2) - (4 * a * c);
    }

    public double getRoot1() {
        return (-b + Math.sqrt(getDiscriminant())) / 2 * a;
    }

    public double getRoot2() {
        return (-b - Math.sqrt(getDiscriminant())) / 2 * a;
    }

}
