interface Payment{
void pay(double amount);
}

class CreditCardPayment implements Payment{
public void pay(double amount)
{System.out.println("Credit Card Payment: "+amount); }
}

class UPIPayment implements Payment{
public void pay(double amount)
{System.out.println("UPI Payment: "+amount); }
}

class Main_Payment{
public static void main(String args[]){
Payment p1=new CreditCardPayment();
Payment p2=new UPIPayment();
p1.pay(45000.0);
p2.pay(6000.0);
}}