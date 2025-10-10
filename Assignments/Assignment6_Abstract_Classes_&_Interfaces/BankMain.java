abstract class Bank{
abstract double getBalance(); 
}

class BankA extends Bank{
double balance=100;
double getBalance(){
return balance; }
}

class BankB extends Bank{
double balance=150;
double getBalance(){
return balance; }
}

class BankC extends Bank{
double balance=200;
double getBalance(){
return balance; }
}

class BankMain{
public static void main(String args[]) {
Bank b[]={new BankA(), new BankB(), new BankC() };
System.out.println("Balance in BankA: $"+b[0].getBalance());
System.out.println("Balance in BankB: $"+b[1].getBalance());
System.out.println("Balance in BankC: $"+b[2].getBalance());
System.out.println("SIA GUPTA 24CSU201");
}}