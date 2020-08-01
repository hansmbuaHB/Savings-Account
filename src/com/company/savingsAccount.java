package com.company;

public class savingsAccount {

    private static double annualInterestRate = 0;
    private double savingBalance;

    public savingsAccount(double savingBalance) {

        this.savingBalance = savingBalance;
    }

    public void calculateMonthlyInterest() {
        this.savingBalance = (savingBalance * annualInterestRate) / 12;
    }

    public static void modifyInterestRate(double annualInterestRate) {
        savingsAccount.annualInterestRate = annualInterestRate;

    }
    public double getSavingBalance(){
        return savingBalance;
    }

}
