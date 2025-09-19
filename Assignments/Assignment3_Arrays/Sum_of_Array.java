import java.util.Scanner;
class Sum_of_Array{
public static void main(String args[])
{ Scanner scan=new Scanner(System.in);
int[] arr=new int[5];
System.out.println("Enter the elements of array");
for(int i=0;i<5;i++)
{arr[i]=scan.nextInt();
}
System.out.println("The array is:");
for(int i=0;i<5;i++)
{System.out.print(arr[i]+" ");
}

//sum of elements
int sum=0;
for(int i=0;i<5;i++)
{sum=sum+arr[i];
}
System.out.println("\n"+"The sum of elements of array is "+sum);

//sum of alternate elements
int sum1=0;
for(int i=0;i<5;i=i+2)
{sum1=sum1+arr[i];
}
System.out.println("\n"+"The sum of elements of array is "+sum1);

System.out.println("SIA GUPTA 24CSU201");
}}