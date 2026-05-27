package model_entidades;

import model_exeções.AccountException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double windrawLimit;

    public Account(Integer number, String holder, Double balance, Double windrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.windrawLimit = windrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWindrawLimit() {
        return windrawLimit;
    }

    public void deposit(Double amount) {
        balance = +amount;
    }

    public void windraw(Double amount) throws AccountException {
        balance = balance - amount;

        if (amount > windrawLimit) {
            throw new AccountException("Withdraw error: The amount exceeds withdraw limit");
        } else if (amount > balance) {
            throw new AccountException("Withdraw error: Not enough balance o que seria esse erro ?");
        }
    }

}
