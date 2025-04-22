package com.program;
class BankAccount {
 private int balance = 0;

 // Synchronized method to prevent race condition
 public synchronized void deposit(int amount) {
     int newBalance = balance + amount;
     // Simulate delay to cause race condition if not synchronized
     try { Thread.sleep(100); } catch (InterruptedException e) {}
     balance = newBalance;
 }

 public int getBalance() {
     return balance;
 }
}
