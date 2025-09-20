interface Bank{
void rateOfInterest();
}

class SBI implements Bank{
double rate;
SBI()
{rate=12.3;}
public void rateOfInterest()
{System.out.println("Rate of Interest SBI: "+rate); }
}

class ICICI implements Bank{
double rate;
ICICI()
{rate=14.1;}
public void rateOfInterest()
{System.out.println("Rate of Interest ICICI: "+rate); }
}

class Bank_Main{
public static void main(String args[]){
Bank b1=new SBI();
Bank b2=new ICICI();
b1.rateOfInterest();
b2.rateOfInterest();
}}