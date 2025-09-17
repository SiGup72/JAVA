import java.util.Scanner;
class Temp_Conversion
{
public static void main(String args[])
{ Scanner scan=new Scanner(System.in);
System.out.println("Will you enter the temperature in Fahrenheit(F) or Celsius(C)");
String choice=scan.next();
System.out.println("Enter the temperature");
double temp=scan.nextDouble();
if(choice.equals("C"))
{double f=((1.8*temp)+32.0);
System.out.println("The tempersture in Fahrenheit is "+f); }
else if(choice.equals("F"))
{double c=((temp-32.0)*0.55);
System.out.println("The temperature in Celcius is "+c); }
else
{System.out.println("Invalid choice, enter F or C."); }


System.out.println("SIA GUPTA 24CSU201");
}
}

