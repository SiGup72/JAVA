abstract class Employee{
String name;
int id;
Employee(String n, int i)
{name=n;
id=i;}
abstract double calculateSalary();
}

class FullTimeEmployee extends Employee{
double salarypermon;
FullTimeEmployee(String n, int i, double s)
{super(n,i);
salarypermon=s;}
double calculateSalary()
{System.out.println("Name: "+name);
System.out.println("ID: "+id);
double salary=salarypermon*12;
return salary; }
}

class PartTimeEmployee extends Employee{
double hours_worked;
double rateperhour;
PartTimeEmployee(String n, int i, double h, double r)
{super(n,i);
hours_worked=h;
rateperhour=r;}
double calculateSalary()
{System.out.println("Name: "+name);
System.out.println("ID: "+id);
double salary=(hours_worked*rateperhour);
return salary;}
}

class Q2{
public static void main(String args[]){
Employee e1=new FullTimeEmployee("ABC",102,20000);
Employee e2=new PartTimeEmployee("XYZ",512,325,12);
System.out.println("Full time employee salary: "+e1.calculateSalary());
System.out.println("Part time employee salary: "+e2.calculateSalary());
}}
