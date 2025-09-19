import java.util.Scanner;
class Search_element{
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

System.out.println("\nEnter the element you want to search");
int x=scan.nextInt();

boolean p=false;
for(int i=0;i<n;i++)
{if(arr[i]==x)
{p=true;
System.out.println("The element is present at index: "+i);
break;}
}
if(!p)
{System.out.println("The element is not present in the array");}

System.out.println("SIA GUPTA 24CSU201");

}
}