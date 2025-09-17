import java.util.Scanner;

class Area{
double length;
double breadth;
double ar;
Area(double length, double breadth)
{this.length=length;
this.breadth=breadth;}

double returnArea()
{ar=length*breadth;
return ar; }

public static void main(String args[])
{Scanner scan=new Scanner(System.in);
System.out.println("Enter length and breadth for rectangle");
double l=scan.nextDouble();
double b=scan.nextDouble();
Area a1=new Area(l,b);
System.out.println("The area of the rectangle is "+a1.returnArea());

System.out.println("SIA GUPTA 24CSU201");
}
}
