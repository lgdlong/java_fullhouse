package Bai_2_7;

public class Program {
    public static void main(String[] args) {
        ATM atm = new ATM();

        System.out.println("ATM after initing:");
        atm.showAllAccounts();
        System.out.println("In using: " + atm.getInUsing());

        System.out.println();

        atm.initializeData();
        System.out.println("ATM after calling initializeData() method:");
        atm.showAllAccounts();
        System.out.println("In using: " + atm.getInUsing());

        System.out.println();

        System.out.println("Recharge but not logged in yet:");
        atm.recharge(50);
        atm.showAllAccounts();
        System.out.println("In using: " + atm.getInUsing());

        System.out.println();

        System.out.println("Login account:");
        atm.login("S1", "1234");
        atm.showAllAccounts();
        System.out.println("In using: " + atm.getInUsing());

        System.out.println();

        System.out.println("Recharge money:");
        atm.recharge(50);
        atm.showAllAccounts();
        System.out.println("In using: " + atm.getInUsing());

        System.out.println();

        System.out.println("Withdraw money:");
        atm.withdraw(100);
        atm.showAllAccounts();
        System.out.println("In using: " + atm.getInUsing());

        System.out.println();

        System.out.println("Transfer money:");
        atm.transfer("S2", 300);
        atm.showAllAccounts();
        System.out.println("In using: " + atm.getInUsing());

        System.out.println();

        System.out.println("Logout account:");
        atm.logout();
        atm.showAllAccounts();
        System.out.println("In using: " + atm.getInUsing());

        System.out.println();

        System.out.println("Recharge but logged out:");
        atm.recharge(50);
        atm.showAllAccounts();
        System.out.println("In using: " + atm.getInUsing());

    }
}
