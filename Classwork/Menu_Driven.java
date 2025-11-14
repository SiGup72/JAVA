import java.util.Scanner;

class Menu_Driven {
public static int addition(int a,int b){
return a+b;}


public static void evenodd(int a){
if (a%2==0){
System.out.println("number is even");}
else{
System.out.println("number is odd");}}


public static void factorial(int a){
long factorial = 1;
int i = a;
while (i >= 1) {
factorial *= i;
i--;
}
System.out.println("Factorial of " + num + " is: " + factorial);}


public static void reverse(String str) {
String str = scan.nextLine();
String reversed = "";
for (int i = str.length() - 1; i >= 0; i--) {
reversed += str.charAt(i);}
System.out.println("Reversed string: " + reversed);}}


public static void maxarray(int arr[]) {
int n;
System.out.println(" enter n ");
n = scan.nextInt();
int arr[]=new int[n];
for(int i = 0;i<n;i+=1){
arr[i]=scan.nextInt();}
for(int i = 0;i<n;i+=1){
System.out.println(arr[i]);}
int maxno=arr[0];
for(int i = 0;i<n;i+=1){
if (arr[i]>maxno){
maxno=arr[i];}}
System.out.println("maximum no is "+maxno);
}}



public static Boolean palindrome(int f){
int rem = 0;
int sum = 0;
while(f>0){
rem = f%10;
sum+=rem;
f = f/10;}
if (sum == f){
return true;}
else{
return false;}}


public static void prime(int g){
boolean n= true;
if(g<=1)
{n=false;}
else{
for(int i=2;i<=(g/2);i++)
{if(g%i==0)
 {n=false;
  break;}
if(n){
System.out.println("The number is prime");}
else{
System.out.println("The number is not prime");
}


public static void main(String args[]){
Scanner scan=new Scanner(System.in);
int a = scan.nextInt();
int b = scan.nextInt();
System.out.println("Enter choice 1/2/3/4/5/6/7");
int choice;
choice=scan.next();
switch(choice){
case 1: addition();
case 2: evenodd();
case 3: factorial();
case 4: reverse();
case 5: maxarray();
case 6: palindrome();
case 7: prime();
default: print("exit, invalid choice");}}
