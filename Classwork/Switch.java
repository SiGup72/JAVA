import java.util.Scanner;

class Switch{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
System.out.println(" a. Addition     b. Subtraction    c. Multiplication    d. Division    e. Modulus");
System.out.println("Enter your choice a-e");
String n=scan.next();
int a,b;
System.out.println("Enter values of a and b");
a=scan.nextInt();
b=scan.nextInt();
switch(n)
{case "a": {System.out.println("The sum is "+(a+b)); break;}
case "b": {System.out.println("The difference is "+(a-b)); break;}
case "c": {System.out.println("The product of them is "+(a*b)); break;}
case "d": {System.out.println("Division "+(a/b)); break;}
case "e": {System.out.print("Modulus "+(a%b)); break;}
default: {System.out.print("Invalid choice");}
}
}
}