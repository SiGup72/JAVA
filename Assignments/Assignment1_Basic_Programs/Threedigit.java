import java.util.Scanner;

class Threedigit{

public static void main(String args[])
{
System.out.println("Enter a three digit number");
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int rem;
int sum=0,rev=0;
while(n>0)
{ rem=n%10;
sum=sum+rem;
rev=rev*10+rem;
n=n/10;
}
System.out.println("The sum of the digits is "+sum);
System.out.println("The reverse of the digits is "+rev);

System.out.println("SIA GUPTA 24CSU201");
}
}
