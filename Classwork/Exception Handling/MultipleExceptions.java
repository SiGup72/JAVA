import java.lang.Throwable;
import java.util.Scanner;
class MultipleExceptions{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
try{
try{
int arr[]=new int[5];
System.out.println("Enter elemnets of array");
for(int i=0;i<5;i++){
arr[i]=scan.nextInt();
}
System.out.println("Enter the index");
int x=scan.nextInt();
System.out.println(arr[x]);
}
catch(ArrayIndexOutOfBoundsException e){
System.out.println(e); }
try{
System.out.println("Enter the denominator");
int a=scan.nextInt();
int r=25/a;
System.out.println(r);
}
catch(ArithmeticException e){
System.out.println(e); }
}
catch(Exception e){
System.out.println("General error occured"); }
System.out.println("Program continues...");
}}
//if it was in same try block then after the exception the rest of the code doesn't execute.