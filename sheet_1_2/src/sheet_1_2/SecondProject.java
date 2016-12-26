/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sheet_1_2;

import java.util.Date;

/**
 *
 * @author Emad Gamil Anton
 */
public class SecondProject {

    public static void main(String[] args) {
        Account a = new Account(1122, 20000);
        a.setAnnualInterestRate(4.5);
        a.withdraw(2500);
        a.deposit(3000);

        System.out.println("The Account number " + a.getId() + ", \nCreated at "
                + a.getDateCreated() + ", \nHave a current balance ("
                + a.getBalance() + " $) " + ", \nWith a monthly interest "
                + a.getMonthlyInterest() +" $.");
    }
}
class Account {
    
    private int id;
    private double annualInterestRate, balance;
    private Date dateCreated = new Date();

    public Account() {
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 1200;
    }

    public double getMonthlyInterest() {
        return balance * (annualInterestRate / 1200);
    }

    public void withdraw(double num) {
        balance = balance - num;
    }

    public void deposit(double num) {
        balance = balance + num;
    }
}
