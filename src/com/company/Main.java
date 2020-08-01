package com.company;

public class Main {

    public static void main(String[] args) {
        savingsAccount saver1 = new savingsAccount(2000.00);
        savingsAccount saver2 = new savingsAccount(3000.00);

        savingsAccount.modifyInterestRate(4);

        for (int i = 0; i <= 12; i++) {
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();

        }
        System.out.println("the saving balance for saver 1 is: "+saver1.getSavingBalance());
        System.out.println("the saving balance for server 2 is: "+saver2.getSavingBalance());


        System.out.println("setting new saving rate/n");
        //setting new saving rate
        savingsAccount.modifyInterestRate(5);

        for (int i = 0; i <= 12; i++) {
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();

        }
        System.out.println("the saving balance for saver 1 is: "+saver1.getSavingBalance());
        System.out.println("the saving balance for server 2 is: "+saver2.getSavingBalance());

    }
}
