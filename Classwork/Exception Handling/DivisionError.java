import java.lang.Throwable;
import java.util.Scanner;
class DivisionError{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
try{
System.out.println("Enter numertor and denominator");
int a=scan.nextInt();
int b=scan.nextInt();
int result=a/b;
System.out.println("The result is:"+result);
}
catch(ArithmeticException e){
System.out.println(e);
}
System.out.println("Program continues...");
}}