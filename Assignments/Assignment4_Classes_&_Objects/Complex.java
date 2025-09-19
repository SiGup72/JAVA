import java.util.Scanner;

class Complex{
double real1;
double img1;
double real2;
double img2;

Complex(double a, double b, double c,double d)
{real1=a;
img1=b;
real2=c;
img2=d;}

void Add()
{System.out.println("The sum is: " + (real1+real2) + " + " + (img1+img2)+"i");}

void Subtract()
{System.out.println("The difference is: " + (real1-real2) + " + " + (img1-img2) + "i");}

void Product()
{double realPart = (real1 * real2) - (img1 * img2);
double imagPart = (real1 * img2) + (img1 * real2);
System.out.println("The product is: " + realPart + " + " + imagPart + "i");}

public static void main(String args[])
{Scanner scan=new Scanner(System.in);
System.out.println("Enter real and imaginary part for first complex number:");
double a=scan.nextDouble();
double b=scan.nextDouble();
System.out.println("Enter real and imaginary part for second complex number:");
double c=scan.nextDouble();
double d=scan.nextDouble();
Complex c1=new Complex(a,b,c,d);
c1.Add();
c1.Subtract();
c1.Product();
System.out.println("SIA GUPTA 24CSU201");
}}