import java.util.Scanner;
class Remove_Duplicates{
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
//remove duplicates
System.out.println("The array without the duplicate values is:");
int arr2[]= new int[5];
int k=0;
for(int i=0;i<5;i++)
{boolean a=false;
for(int j=0;j<k;j++){
if (arr[i]==arr2[j])
{a=true;
break;}
}
if(!a)
{arr2[k++]=arr[i];}      
}
for (int i=0;i<k;i++)
{ System.out.print(arr2[i]+" "); }

System.out.println("\nSIA GUPTA 24CSU201");

}
}