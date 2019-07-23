package com.JonMockbee;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,0000 at 2% interest " + calculateInterest(10000,2.0));
    for (int i= 0; i<5; i++){
        System.out.println("Loop " + i + " hello!");
    }
        for (int i = 2; i<9; i++){
            System.out.println("10,0000 at"+ i + "% interest " + String.format("%.2f",calculateInterest(10000,i)));
        }
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

        for (int i = 8; i >=2; i--){
            System.out.println("10,0000 at"+ i + "% interest " + String.format("%.2f",calculateInterest(10000,i)));
        }

    }

    public static double calculateInterest(double amount,double interestRate){
    return (amount* (interestRate/100));

    }
}
