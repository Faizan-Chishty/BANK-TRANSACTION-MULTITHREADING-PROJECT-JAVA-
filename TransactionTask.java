package com.MultiThreading.Project;

//File: TransactionTask.java
import java.util.concurrent.Callable;

public class TransactionTask implements Callable<String> {
 private BankAccount account;
 private double depositAmount;
 private double withdrawAmount;

 public TransactionTask(BankAccount account, double deposit, double withdraw) {
     this.account = account;
     this.depositAmount = deposit;
     this.withdrawAmount = withdraw;
 }

 @Override
 public String call() {
     account.deposit(depositAmount);
     account.withdraw(withdrawAmount);
     return "Transaction completed for Account: " + account.getAccountId();
 }
}

	// This class implements Callable to allow concurrent transactions on a BankAccount.