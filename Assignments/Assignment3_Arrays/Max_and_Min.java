import java.util.Scanner;
class Max_and_Min{
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
//min and max
int min=arr[0];
int max=arr[0];
for(int i=0;i<n;i++)
{if(arr[i]<min)
{min=arr[i];}
if(arr[i]>max)
{max=arr[i];}
}
System.out.println("The minimum element of array is "+min);
System.out.println("The maximum element of array is "+max);

System.out.println("SIA GUPTA 24CSU201");
}}