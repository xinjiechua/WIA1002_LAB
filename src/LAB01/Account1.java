package LAB01;

import java.util.ArrayList;

public class Account1 extends Account{
    private String name;
    private ArrayList <Transaction> transaction = new ArrayList<>();

    public Account1(){

    }

    public Account1(String name, int id, double balance){
        super(id, balance);
        this.name = name;
    }

    public void withdraw(double amount, String description){
        super.withdraw(amount);
        transaction.add(new Transaction('W',amount, super.getBalance(), description));
    }

    public void deposit(double amount, String description){
        super.deposit(amount);
        transaction.add(new Transaction('D', amount ,super.getBalance(), description));
    }

    public String getName(){
        return name;
    }

    public ArrayList<Transaction> getTransactions() {
        return transaction;
    }

    public static void main(String[] args) {
        Account1 a = new Account1("George", 1122, 1000);
        a.setAnnualInterestRate(0.015);
        a.deposit(30, "1st deposit");
        a.deposit(40, "2nd deposit");
        a.deposit(50, "3rd deposit");
        a.withdraw(5, "1st withdraw");
        a.withdraw(4, "2nd withdraw");
        a.withdraw(2, "3rd withdraw");

        System.out.println("Account summary: ");
        System.out.println("Account holder: " + a.getName());
        System.out.println("Interest rate: " + a.getAnnualInterestRate());
        System.out.println("Balance: " + a.getBalance() + "\n");
        System.out.println("Transactions:");

        for (Transaction transaction : a.getTransactions()) {
            System.out.println(transaction.toString());
        }
    }
}
