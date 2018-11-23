package ru.itaprk;

public class DepositService {

    public int calculateDeposit(int depositAmount, int depositTerm, int interestRate) {
        double fixedRate = 12.5;
        int tax = 35;
        double finalAmount = 0;

        if (interestRate < fixedRate) {
            finalAmount =  depositAmount + (depositAmount * interestRate/100) * depositTerm / 12;

        } else {
            double interest = interestRate - fixedRate;
            finalAmount = depositAmount + (depositAmount* interestRate/ 100)* depositTerm / 12 - (depositAmount * interest / 100) * tax / 100;

        }
        return (int) finalAmount;
    }
}
