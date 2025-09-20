import java.util.Scanner;

class Varargs{
public static double average(double... args)
{double sum=0;
for(double marks: args)
{sum=sum+marks;}
double avg=sum/args.length;
return avg;
}

public static void main(String args[]) {
Scanner scan=new Scanner(System.in);
System.out.println("Enter how many subjects are there");
int l=scan.nextInt();
double mark[]=new double[l];
System.out.println("Enter marks");
for(int i=0;i<l;i++)
{mark[i]=scan.nextDouble();}
System.out.println("The average of marks is "+average(mark));
}}