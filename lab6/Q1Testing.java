// package lab6;
import java.util.Scanner;
import java.lang.Math;

class Account {
    public String name, accType;
    public int accNo;
    public int balance;

    void deposit(double amount){
        balance += amount;
    }

    void withdraw(double amount){
        balance -= amount;
    }

    void displayDetails(){
        System.out.println("Account type: "+ accType);
        System.out.println("Acc no: "+accNo);
        System.out.println("Balace: "+balance);
    }
        
    void displayBal(){
        System.out.println("Current Balance: "+balance);
    }
}

class Savings extends Account {
    // super("Savings");
    private double interestRate=5;
    accType = "Savings";
    double interest(double year){
        return balance*Math.pow((1+interestRate), year);
    }
}

class Current extends Account{
    private double serviceTax = 100, minBal = 1000;
    private int isBelowMinBal=0;
    accType = "Current";

    void deposit(double amount){
        balance += amount;
        if (balance>minBal && isBelowMinBal!=0) {
            isBelowMinBal=0;
            balance-=serviceTax;
        }
    }

    void withdraw(double amount){
        balance -= amount;
        if (balance<minBal && isBelowMinBal!=1) {
            isBelowMinBal=1;
            balance-=serviceTax;
        }
    }
}

class banking{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


    }
}