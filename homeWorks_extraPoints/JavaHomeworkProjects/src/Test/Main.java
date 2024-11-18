package Test;

import java.security.NoSuchAlgorithmException;
import java.util.*;

class Account {
    private String id;
    private double balance;

    public Account() {
    }

    public Account(String id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", balance=" + balance +
                '}';
    }
}

class AccountList extends Account {
    ArrayList<Account> list;
    Account inUsing;

    public AccountList() {
        super();
        list = new ArrayList<>();
        inUsing = null;
    }

    public ArrayList<Account> getList() {
        return list;
    }

    public void setList(ArrayList<Account> list) {
        this.list = list;
    }

    public Account getInUsing() {
        return inUsing;
    }

    public void setInUsing(Account inUsing) {
        this.inUsing = inUsing;
    }

    public void addAll(ArrayList<Account> arr) {
        list.addAll(arr);
    }

    public void showAll() {
        for (Account a: list) {
            System.out.println(a);
        }
        System.out.println();
    }

    public void login(String id) {
        for (Account a : list) {
            if (id.equals(a.getId())) {
                setInUsing(a);
                return;
            }
        }
    }

    public void recharge(double money) {
        if (money <= 0) {
            System.out.println("Must has money!");
            return;
        }

        double newBalance = inUsing.getBalance() + money;

        inUsing.setBalance(newBalance);
    }

    public void withdraw(double money) {
        if (inUsing.getBalance() <= 0) {
            System.out.println("You broke!");
        }
        if (money <= 0) {
            System.out.println("Withdraw must have!");
            return;
        }

        if (inUsing.getBalance() < money) {
            System.out.println("Account do not enough money!");
            return;
        }

        double newBalance = inUsing.getBalance() - money;

        inUsing.setBalance(newBalance);
    }
}

public class Main {
    public static void main(String[] args) {
        Account a1 = new Account("S1", 2);
        Account a2 = new Account("S2", 3);
        Account a3 = new Account("S3", 5);
        Account a4 = new Account("S4", 10);

        ArrayList<Account> arr = new ArrayList<>(Arrays.asList(a1, a2, a3, a4));

        AccountList accountList = new AccountList();
        accountList.addAll(arr);

        accountList.showAll();

        accountList.login("S3");

        accountList.recharge(10);
        accountList.showAll();

        accountList.withdraw(7);
        accountList.showAll();

        accountList.withdraw(9);
    }
}