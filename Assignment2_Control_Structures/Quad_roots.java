import java.util.Scanner;

class Quadratic_roots
{ public static void main(String args[])
{ Scanner scan= new Scanner(System.in);

System.out.println("Quadratic eqaution: ax^2+bx+c=0");
System.out.println("Enter the coefficients a, b and c");
int a=scan.nextInt();
int b=scan.nextInt();
int c=scan.nextInt();
double d=(b*b)-(4*a*c);

if(d>0)
{System.out.println("The roots are Real and distinct:");
double root1=(-b+Math.sqrt(d))/(2*a);
double root2=(-b-Math.sqrt(d))/(2*a);
System.out.println("The roots are "+root1+" and "+root2); }

else if(d==0)
{ System.out.println("The roots are Real and equal:");
double root=-b/(2*a);
System.out.println("The roots are "+root); }

else
{ System.out.println("The roots are Imaginary:");
double rootr=-b/(2*a);
double rooti=Math.sqrt(-d)/(2*a);
System.out.println("The roots are "+rootr+" + "+rooti+"i and "+rootr+" - "+rooti+"i"); }

System.out.println("SIA GUPTA 24CSU201");
}
}