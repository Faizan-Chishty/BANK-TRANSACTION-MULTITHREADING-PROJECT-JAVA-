package com.MultiThreading.Project;

//File: MainExecutor.java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MainExecutor {
 public static void main(String[] args) throws Exception {
     BankAccount acc = new BankAccount(101, 1000.0);

     ExecutorService service = Executors.newFixedThreadPool(2);

     TransactionTask t1 = new TransactionTask(acc, 500, 300);
     TransactionTask t2 = new TransactionTask(acc, 700, 400);

     Future<String> result1 = service.submit(t1);
     Future<String> result2 = service.submit(t2);

     System.out.println(result1.get());
     System.out.println(result2.get());

     service.shutdown();
 }
}
// This class demonstrates the use of ExecutorService to manage concurrent transactions on a BankAccount.