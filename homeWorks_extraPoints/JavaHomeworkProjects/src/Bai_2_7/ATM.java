package Bai_2_7;

import java.util.ArrayList;

public class ATM extends Account {
    private ArrayList<Account> accountList;
    private Account inUsing;

    public ATM() {
        accountList = new ArrayList<>();
        inUsing = null;
    }

    public ArrayList<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(ArrayList<Account> accountList) {
        this.accountList = accountList;
    }

    public Account getInUsing() {
        return inUsing;
    }

    public void setInUsing(Account inUsing) {
        this.inUsing = inUsing;
    }

    //--------------- OTHER METHODS -------------------

    public Account findAccountById(String id) {
        if (id == null) return null; // Null-safe
        for (Account account : accountList) {
            if (account.getId().equals(id)) {
                return account;
            }
        }
        return null;
    }

    public void initializeData() {
        Account account1 = new Account("S1", "1234", 5000.00);
        Account account2 = new Account("S2", "5678", 10000.00);
        Account account3 = new Account("S3", "4321", 7500.00);
        Account account4 = new Account("S4", "8765", 3000.00);
        Account account5 = new Account("S5", "1111", 20000.00);

        // Add accounts to the accountList
        accountList.add(account1);
        accountList.add(account2);
        accountList.add(account3);
        accountList.add(account4);
        accountList.add(account5);

        System.out.println("Accounts initialized successfully!");
    }

    public void showAllAccounts() {
        if (accountList.isEmpty()) {
            System.out.println("There's no account!");
            return;
        }

        for (Account account : accountList) {
            System.out.println(account);
        }
    }

    /**
     * duyet tim account trong list trung voi id can tim
     * - neu tim khong thay: TIM KHONG THAY ACCOUNT!
     * - neu tim thay:
     *      + check pin (success): cap nhat account do vao inUsing bang setter;
     *      + check pin (wrong): SAI MA PIN!
     */
    public void login(String id, String pin) {
        if (id == null || id.trim().isEmpty()) {
            System.out.println("ID cannot be empty or blank.");
            return;
        }
        if (pin == null || pin.trim().isEmpty()) {
            System.out.println("PIN cannot be empty or blank.");
            return;
        }

        Account account = findAccountById(id);

        if (account == null) { // account not found in the list
            System.out.println("Account not found!");
            return;
        }

        if (!account.getPin().equals(pin)) { // check the wrong pin account
            System.out.println("PIN is wrong!");
            return;
        }

        setInUsing(account); // set account was found to inUsing
        System.out.println("Login successfully!");
    }

    public void logout() {
        inUsing = null;
        System.out.println("You have successfully logged out.");
    }

    public void recharge(double money) {
        if (money <= 0) {
            System.out.println("Recharge money must greater than 0!");
            return;
        }

        if (inUsing == null) {
            System.out.println("No account is currently in use. Please login first.");
            return;
        } else {
            double newBalance = inUsing.getBalance() + money;
            inUsing.setBalance(newBalance);
            System.out.println("Recharge successfully!");
        }
    }

    public void withdraw(double money) {
        if (money <= 0) {
            System.out.println("Withdraw money must greater than 0!");
            return;
        }

        if (inUsing == null) {
            System.out.println("No account is currently in use. Please login first.");
        } else {
            if (!inUsing.isBalanceValid(inUsing.getBalance())) { // check the inUsing balance
                System.out.println("You broke! Cannot withdraw money!");
                return;
            }

            if (inUsing.getBalance() < money) { // balance must > withdraw money
                System.out.println("Do not enough money!");
                return;
            }

            double newBalance = inUsing.getBalance() - money;
            inUsing.setBalance(newBalance); // update after withdrawing
        }

    }

    public void transfer(String id, double money) {
        if (money <= 0) {
            System.out.println("Transfer amount must be greater than 0!");
            return;
        }

        if (inUsing == null) {
            System.out.println("No account is currently in use. Please login first.");
        } else {
            System.out.printf("Transfer money with amount %f from %s to %s:\n", money, inUsing.getId(), id);

            if (inUsing.getId().equals(id)) {
                System.out.println("Cannot transfer money to the same account!");
                return;
            }

            if (inUsing.getBalance() < money) {
                System.out.println("Do not enough money in the account to transfer!");
                return;
            }

            Account accountTakeMoney = findAccountById(id);

            if (accountTakeMoney == null) {
                System.out.println("Account take money not found!");
                return;
            }

            inUsing.setBalance(inUsing.getBalance() - money);
            accountTakeMoney.setBalance(accountTakeMoney.getBalance() + money);


            System.out.printf("Transfer successfully from %s to %s with amount %f!\n", inUsing.getId(), accountTakeMoney.getId(), money);
        }
    }
}
