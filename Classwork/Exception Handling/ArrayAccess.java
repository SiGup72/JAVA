import java.lang.Throwable;
import java.util.Scanner;
class ArrayAccess{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
try{
int arr[]=new int[5];
System.out.println("Enter the elements of array");
for(int i=0;i<5;i++)
{arr[i]=scan.nextInt(); }
System.out.println("Enter the index");
int x=scan.nextInt();
System.out.println("Element is:"+arr[x]);
}
catch(ArrayIndexOutOfBoundsException e){
System.out.println(e);
}
System.out.println("Program continues...");
}}