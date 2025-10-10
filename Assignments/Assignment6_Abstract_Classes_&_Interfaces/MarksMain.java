abstract class Marks{
abstract double getPercentage();
}

class A extends Marks{
double arr[]=new double[3];
A(double a, double b, double c)
{arr[0]=a;
arr[1]=b;
arr[2]=c; }
double getPercentage()
{double sum=0;
for(int i=0;i<3;i++){
sum+=arr[i];}
double percentage=sum/3;
return percentage;
}}

class B extends Marks{
double arr[]=new double[4];
B(double a, double b, double c, double d)
{arr[0]=a;
arr[1]=b;
arr[2]=c;
arr[3]=d; }
double getPercentage()
{double sum=0;
for(int i=0;i<4;i++){
sum+=arr[i];}
double percentage=sum/4;
return percentage;
}}

class MarksMain{
public static void main(String args[]) {
Marks marks[]=new Marks[2];
marks[0]=new A(25,23.5,30);
System.out.println("Percentage of student A: "+marks[0].getPercentage());
marks[1]=new B(26,29.5,22,19);
System.out.println("Percentage of student B: "+marks[1].getPercentage());
System.out.println("SIA GUPTA 24CSU201");
}}

