import java.util.Scanner;

class Recursion
{int n;
String str;

int factorial(int n)
{if(n==0 || n==1)
{return 1;}
else
{return n*factorial(n-1);}}

void fibonacci(int a, int b,int n)
{if(n>0)
{System.out.print(a+" ");
fibonacci(b,a+b,n-1);}}

String reverse(String str)
{if(str.isEmpty() || str.length()==1) return str;
return reverse(str.substring(1))+str.charAt(0);}

}

class RecursionProgram
{public static void main(String args[])
{Scanner scan=new Scanner(System.in);
Recursion recursion=new Recursion();
System.out.println("Enter a integer");
int n=scan.nextInt();
scan.nextLine();
System.out.println("Enter a string");
String str=scan.nextLine();

System.out.println("Factroial:");
System.out.println(recursion.factorial(n));

System.out.println("Fibonacci Series:");
recursion.fibonacci(0,1,n);
System.out.println();
System.out.println("Reverse of string:");
System.out.println(recursion.reverse(str));


}
}