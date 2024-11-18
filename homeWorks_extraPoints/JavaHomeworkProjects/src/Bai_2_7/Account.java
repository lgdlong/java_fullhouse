package Bai_2_7;

public class Account {
    private String id;
    private String pin;
    private double balance;

    public Account() {
    }

    public Account(String id, String pin, double balance) {
        this.id = id;
        this.pin = pin;
        this.balance = isBalanceValid(balance) ? balance : 0;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = isBalanceValid(balance) ? balance : 0;
    }

    public boolean isBalanceValid(double balance) {
        return balance >= 0;
    }

    @Override
    public String toString() {
        return "Account [" +
                "id='" + id + '\'' +
                ", pin='" + pin + '\'' +
                ", balance=" + balance +
                ']';
    }
}
