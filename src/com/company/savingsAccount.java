package com.company;

public class savingsAccount {

private static int annualInterestRate = 0;
private int savingBalance = 0;

public savingsAccount(int annualInterestRate){

    this.savingBalance = savingBalance;
}

public void monthlyInterest(){
    this.savingBalance = (savingBalance * annualInterestRate)/12;
}

public static void modifyInterestRate(int annualInterestRate){
savingsAccount.annualInterestRate = annualInterestRate;

}

}
