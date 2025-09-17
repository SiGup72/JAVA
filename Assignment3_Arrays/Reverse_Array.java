import java.util.Scanner;
class Reverse{
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

System.out.println();

//reverse an array
int[] arr1=new int[5];
for(int i=0;i<5;i++)
{ arr1[i]=arr[5-1-i];
}
System.out.println("The reversed array is:");
for(int i=0;i<5;i++)
{System.out.print(arr1[i]+" ");
}

}}