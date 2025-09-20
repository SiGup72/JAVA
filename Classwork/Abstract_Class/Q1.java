abstract class Shape{
abstract double getArea(); 
}

class Rectangle extends Shape{
double length;
double width;
Rectangle(double a, double b)
{length=a;
width=b;}
double getArea()
{double area=length*width;
return area;}
}

class Circle extends Shape{
double radius;
Circle(double r)
{radius=r;}
double getArea()
{double area=3.14*radius*radius; 
return area;}
}

class Q1{
public static void main(String args[]){
Shape s1=new Rectangle(4,6);
Shape s2=new Circle(5);
System.out.println("The area of rectangle: "+s1.getArea());
System.out.println("The area of circle: "+s2.getArea());
}}