abstract class BankAccount{
int Accountnumber;
double balance;
BankAccount(int a,double b)
{Accountnumber=a;
balance=b;}

void deposit(double d)
{balance=balance+d;
System.out.println("The new balance is "+balance); }

abstract void withdraw(double wd);
}

class SavingsAccount extends BankAccount{

SavingsAccount(int a,double b)
{super(a,b); }

void withdraw(double wd)
{ if(wd>balance)
{System.out.println("Cannot withdraw,insuffecient balance");}
else
{balance=balance-wd;
System.out.println("The new balance is "+balance); }
}
}

class CurrentAccount extends BankAccount{
CurrentAccount(int a,double b)
{super(a,b); }

void withdraw(double wd)
{ if((balance+wd)>10000)
{System.out.println("Cannot withdraw,insuffecient balance");}
else
{balance=balance-wd;
System.out.println("The new balance is "+balance); }
}
}

class Q4{
public static void main(String args[]) {
SavingsAccount s=new SavingsAccount(123,50000);
CurrentAccount c=new CurrentAccount(456,2000);

System.out.println("Saving Account");
s.deposit(2500);
s.withdraw(1200);

System.out.println("Current Account");
c.deposit(1000);
c.withdraw(8000);


}}

