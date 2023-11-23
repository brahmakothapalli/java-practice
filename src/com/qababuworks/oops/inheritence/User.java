package com.qababuworks.oops.inheritence;

public class User {

    public static void main(String[] args) {
        // only SBI obj can access all the methods
        SBI sbi = new SBI();
        sbi.deposit();
        sbi.specialityInsurance();
        sbi.balanceEnquiry();
        sbi.withdraw();

        // parent class can't access te methods of child
        Bank bank = new SBI();
        bank.balanceEnquiry();
        bank.deposit();
        bank.withdraw();
    }
}
