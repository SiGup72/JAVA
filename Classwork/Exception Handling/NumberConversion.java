import java.lang.Throwable;
import java.util.Scanner;
class NumberConversion{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
try{
int a=Integer.parseInt(args[0]);
System.out.println("Integer:"+a);
}
catch(NumberFormatException e){
System.out.println(e);
}
System.out.println("Program continues...");
}}