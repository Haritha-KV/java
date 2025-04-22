package com.program;

public class Main {
 public static void main(String[] args) throws InterruptedException {
     BankAccount account = new BankAccount();

     // Thread 1 deposits 100
     Thread t1 = new Thread(() -> account.deposit(100));

     // Thread 2 deposits 100
     Thread t2 = new Thread(() -> account.deposit(100));

     // Start both threads
     t1.start();
     t2.start();

     // Wait for both threads to finish
     t1.join();
     t2.join();

     // Print final balance
     System.out.println("Final balance: " + account.getBalance());  // Should always print 200
 }
}
