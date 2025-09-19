import java.util.Scanner;
class Odd_Even{
public static void main(String args[])
{ Scanner scan=new Scanner(System.in);
System.out.println("Enter the number of elements of array");
int n=scan.nextInt();
int[] arr=new int[n];
System.out.println("Enter the elements of array");
for(int i=0;i<n;i++)
{arr[i]=scan.nextInt();
}
System.out.println("The array is:");
for(int i=0;i<n;i++)
{System.out.print(arr[i]+" ");
}

System.out.println();

//odd and even
int o=0,e=0;
int[] EvenArray=new int[n];
int[] OddArray=new int[n];
for(int i=0;i<n;i++)
{ if(arr[i]%2==0)
{EvenArray[e]=arr[i];
e++;}
else
{OddArray[o]=arr[i];
o++;}}

System.out.println("The even array has "+e+" elements and is:");
for(int j=0;j<e;j++)
{System.out.print(EvenArray[j]+" ");}
System.out.println();

System.out.println("The odd array has "+o+" elements and is:");
for(int j=0;j<o;j++)
{System.out.print(OddArray[j]+" ");}
System.out.println();

System.out.println("SIA GUPTA  24CSU201");
}}