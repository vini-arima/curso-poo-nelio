package entidades;

public class Titular {
    private int account;
    private String holder;
    private double balance;

    // EXIGE DOIS CONSTRUTORES
    public Titular(int account, String holder, double balance) {
        this.account = account;
        this.balance = balance;
        this.holder = holder;
    }

    public int getAccount() {
        return account;
    }

    public String getHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    // ERROS - setbalance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double depositar) {
        depositar = +balance; // balance =+ depositar
    }

    public void withdraw(double windraw) {
        windraw = (windraw - balance) + 5.0;
    }
}
