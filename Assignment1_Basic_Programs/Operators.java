import java.util.Scanner;

class Operators{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
System.out.println(" a. Addition     b. Subtraction    c. Multiplication    d. Division    e. Modulus");
System.out.println("Enter your choice a-e");
String n=scan.next();
int a,b;
System.out.println("Enter values of a and b");
a=scan.nextInt();
b=scan.nextInt();
if(n.equals("a")){
System.out.println("The sum is "+(a+b));}
else if(n.equals("b")){
System.out.println("The difference is "+(a-b));}
else if(n.equals("c")){
System.out.println("The product of them is "+(a*b));}
else if(n.equals("d")){
System.out.println("Division "+(a/b));}
else if(n.equals("e")){
System.out.print("Modulus "+(a%b));}
else{
System.out.print("Invalid choice");}


System.out.println("SIA GUPTA 24CSU201");
}
}