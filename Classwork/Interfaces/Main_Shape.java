interface Shape{
void area();
}

class Circle implements Shape{
double radius;
Circle(double r)
{radius=r; }
public void area()
{double area=3.14*radius*radius;
System.out.println("Area of cirlce: "+area);}
}

class Rectangle implements Shape{
double length;
double breadth;
Rectangle(double l, double b)
{length=l;
breadth=b;}
public void area()
{double area=length*breadth;
System.out.println("Area of rectangle: "+area);}
}

class Main_Shape{
public static void main(String args[]) {
Shape s1= new Circle(5.2);
Shape s2= new Rectangle(4.2,2.6);
s1.area();
s2.area();
}}