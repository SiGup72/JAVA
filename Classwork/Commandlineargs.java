class Commandlineargs
{
public static void main(String args[])
{
int a=Integer.parseInt(args[0]);
int fact=1;
if(a==0 || a==1)
{fact=1;}
else
{for(int i=a;i>0;i--)
{fact=fact*i;
} }
System.out.println("Factorial is "+fact);

}}