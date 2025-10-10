abstract class Shape{
abstract void RectangleArea(double length, double breadth);
abstract void SquareArea(double side);
abstract void CircleArea(double radius);
}

class Area extends Shape{
void RectangleArea(double length, double breadth){
double area=length*breadth;
System.out.println("Area of Rectangle: "+area); }

void SquareArea(double side){
double area=side*side;
System.out.println("Area of Square: "+area); }

void CircleArea(double radius) {
double area=3.14*radius*radius;
System.out.println("Area of Circle: "+area); }
}

class ShapeMain{
public static void main(String args[]) {
Area a=new Area();
a.RectangleArea(3.25,2.1);
a.SquareArea(4.4);
a.CircleArea(2.3);
System.out.println("SIA GUPTA 24CSU201");
}}
