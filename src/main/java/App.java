/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 William Zheng
 */

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        String Num1 = myApp.readPrice1();
        String Num2 = myApp.Quantity1();
        String Num3 = myApp.readPrice2();
        String Num4 = myApp.Quantity2();
        String Num5 = myApp.readPrice3();
        String Num6 = myApp.Quantity3();
        int int1 = Integer.parseInt(Num1);
        int int2 = Integer.parseInt(Num2);
        int int3 = Integer.parseInt(Num3);
        int int4 = Integer.parseInt(Num4);
        int int5 = Integer.parseInt(Num5);
        int int6 = Integer.parseInt(Num6);
        double taxRate = 0.055;
        double subTotal = myApp.calcSubTotal(int1, int2, int3, int4, int5, int6);
        double tax = myApp.calcTax(subTotal, taxRate);
        double finalTotal = myApp.finalTotal(subTotal, tax);
        String outputString = myApp.generateOutputString(subTotal, tax, finalTotal);
        myApp.printOutput(outputString);
    }

    public void printOutput(String outputString) {
        System.out.println(outputString);
    }

    public String readPrice1(){
        System.out.print("Enter the price of item 1: ");
        return in.nextLine();
    }

    public String readPrice2(){
        System.out.print("Enter the price of item 2: ");
        return in.nextLine();
    }

    public String readPrice3(){
        System.out.print("Enter the price of item 3: ");
        return in.nextLine();
    }

    public String Quantity1(){
        System.out.print("Enter the quantity of item 1: ");
        return in.nextLine();
    }

    public String Quantity2(){
        System.out.print("Enter the quantity of item 2: ");
        return in.nextLine();
    }

    public String Quantity3(){
        System.out.print("Enter the quantity of item 3: ");
        return in.nextLine();
    }

    public int calcSubTotal(int int1, int int2, int int3, int int4, int int5, int int6){
        return (int1 * int2) + (int3 * int4) + (int5 * int6);
    }

    public double calcTax(double SubTotal, double taxRate){
        return (SubTotal * taxRate);
    }

    public double finalTotal(double SubTotal, double tax){
        return (SubTotal + tax);
    }

    public String generateOutputString(double subTotal, double tax, double finalTotal){
        return String.format("Subtotal: $%.2f\nTax: $%.2f\nTotal: $%.2f", subTotal, tax, finalTotal);
    }
}