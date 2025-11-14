package main;
import Bank.Account;
class bank_main{
public static void main(String args[]) {
Account a=new Account();
a.openAccount();
//a.calculateInterest(4.2);  cannot access as its private
//a.displayBalance();  //cannot access in this package
}}