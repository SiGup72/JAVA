import java.util.Scanner;
class Pattern_print{
static public void main(String args[])
{ Scanner scan=new Scanner(System.in);
System.out.print("Enter a character you want to print: ");
char ch = scan.next().charAt(0);
char input='Y';
while(input=='y' || input=='Y'){
System.out.println("Which pattern you want to print:");
System.out.println("1. Pyramid");
System.out.println("2. Left Triangle");
System.out.println("3. Right Triangle");
System.out.println("4. Rhombus");
int x=scan.nextInt();
System.out.print("Enter how many lines do you want: ");
int n= scan.nextInt();
switch(x)
{ case 1:{System.out.println("\nPyramid:");
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) System.out.print(" ");
            for (int k = 1; k <= (2 * i - 1); k++) System.out.print(ch);
            System.out.println();}
break;}
case 2:{System.out.println("\nLeft Triangle:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) System.out.print(ch);
            System.out.println();}
break;}
case 3:{System.out.println("\nRight Triangle:");
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print(ch);
            System.out.println();}
break;}
case 4:{System.out.println("\nRhombus:");
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) System.out.print(" ");
            for (int j = 1; j <= n; j++) System.out.print(ch);
            System.out.println();}

break;}
default:{ 
System.out.println("Invalid choice"); }
}
System.out.println("Do you want to print another pattern? (Y/N): ");
input = scan.next().charAt(0);}

System.out.println("SIA GUPTA 24CSU201"); 
}}
