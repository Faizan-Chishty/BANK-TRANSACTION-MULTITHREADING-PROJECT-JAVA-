package com.MultiThreading.Project;

//BankAccount.java

public class BankAccount {
	// This class represents a bank account with methods for deposit and withdrawal.
	    private int accountId;
	    private double balance;

	    public BankAccount(int id, double initialBalance) {
	        this.accountId = id;
	        this.balance = initialBalance;
	    }

	    public synchronized void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Account " + accountId + ": Deposited " + amount + ", New Balance: " + balance);
	        }
	    }

	    public synchronized void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Account " + accountId + ": Withdrawn " + amount + ", New Balance: " + balance);
	        } else {
	            System.out.println("Account " + accountId + ": Withdrawal of " + amount + " failed. Insufficient balance.");
	        }
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public int getAccountId() {
	        return accountId;
	    }
	}
// This class provides synchronized methods for depositing and withdrawing money,
