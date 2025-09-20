class Employee{
String name;
int id;

Employee(String name, int id)
{this.name=name;
this.id=id;}

void displayDetails()
{ System.out.println("Id and name of employee: "+ id +", "+ name); }
}

class Manager extends Employee{
String department;

Manager(String name, int id, String department)
{super(name,id);
this.department=department; }

void displayDetails()
{super.displayDetails();
System.out.println("Department: "+department);
}
}

class Dept_Man {
public static void main(String args[]) {
Manager m=new Manager("Alice",150,"HR");
m.displayDetails();
}}
