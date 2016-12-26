/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sheet_1_1;

/**
 *
 * @author Emad
 */
public class Test {

    public static void main(String[] args) {
        Stock stock = new Stock("ORCL", "Oracle Corporation");
        stock.currentPrice = 34.35;
        stock.previousClosingPrice = 34.5;

        System.out.println("The Price-change percentage is : "+ stock.getChangePercent(stock.previousClosingPrice, stock.currentPrice));
    }

}

class Stock {

    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    public Stock() {
    }

    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;

    }

    public  double getChangePercent(double previousClosingPrice,double currentPrice) {
        return (currentPrice - previousClosingPrice )/100;
    }

}
