package LAB01;

import java.util.Date;

public class Transaction {
    private Date date;
    private char type;
    private double amount, balance;
    private String description;

    public Transaction(char type, double amount, double balance, String description) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
        this.date = new Date();
    }

    public String toString(){
        return String.format("Date: %s\nType: %s \nAmount: %.2f\nBalance: %.2f\nDescription: %s\n", date,type,amount,balance, description);
    }
}
