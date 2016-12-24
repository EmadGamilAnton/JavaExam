/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loan;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Emad
 */
public class Loan {

    private double annualIntersetRate=2.5;
    private int numberOfYear=1;
    private double loanAmount=1000;
    private Date loanDate =new Date();

    public Loan() {
    }
    
    Loan(double annualInterstRate,int numberOfYear, double loanAmount){
        this.annualIntersetRate=annualInterstRate;
        this.numberOfYear=numberOfYear;
        this.loanAmount=loanAmount;
    }
    public double getAnnualIntersetRate(){
        return annualIntersetRate;
    }
    public int getNumberOfYear(){
        return numberOfYear;
    }
    public double getLoanAmount(){
        return loanAmount;
    }
    public Date getLoanDate(){
        return loanDate;
    }
    public void setNumberOfYear(int numberOfYear){
        this.numberOfYear=numberOfYear;
    }
    public void setLoanAmount(double loanAmount){
        this.loanAmount=loanAmount;
    }
    public double getMonthlyPayment(){
        double monthlyInterstYear = annualIntersetRate/1200;
        double monthlyPayment = loanAmount * monthlyInterstYear/(1-(1/Math.pow(1+monthlyInterstYear,numberOfYear*12)));
        
        return monthlyPayment;
    }
    public double getTotalPayment(){
        double totalPayment = getMonthlyPayment() * numberOfYear * 12;
        return  totalPayment;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter yearly interst rate,for example 5.25");
        double annualInterstYear = scan.nextDouble();
        System.out.println("Enter number of Year");
        int numberOfYear = scan.nextInt();
        System.out.println("Enter Loan Amount like 12000.95");
        double loanAmount = scan.nextDouble();
        
        Loan loan = new Loan(annualInterstYear, numberOfYear, loanAmount);
        System.out.println("Loan was created on " + loan.getLoanDate().toString());
        System.out.println("monthly payment     " + loan.getMonthlyPayment());
        System.out.println("totalPayment        " + loan.getTotalPayment());
    }
    
}
