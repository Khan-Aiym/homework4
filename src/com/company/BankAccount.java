package com.company;

public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public void deposit(double sum) {
        amount += sum;
        System.out.println( " Вы пополнили счет на " + sum);
    }
    public void withDraw(int minus) throws LimitException {
        if (amount < minus) {
            throw new LimitException( " Операция невозможна, недостаточно средств на счету ", amount);

        } else {
            amount -= minus;
            System.out.println( " Вы сняли " + minus + " Остаток на счету " + amount);
        }
    }
}
