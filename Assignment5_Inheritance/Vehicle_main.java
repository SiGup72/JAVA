import java.util.Scanner;
class Vehicle_Main{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
System.out.println("Enter the number of tyres");
int n=scan.nextInt(); // Vehicle vehicle;
switch(n){
case 2:
{Bike vehicle=new Bike(); //vehicle=new Bike();
vehicle.display();
break;}
case 4:
{Car vehicle=new Car();    //vehicle=new Car();
vehicle.display();
break;}
default:
{Vehicle vehicle= new Vehicle(); //vehicle=new Vehicle();
vehicle.display();}
}

System.out.println("SIA GUPTA 24CSU201");
}}
