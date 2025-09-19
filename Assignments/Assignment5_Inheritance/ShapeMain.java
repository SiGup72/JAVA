class Shape{
void displays()
{System.out.println("This is shape");}
}

class Circle extends Shape{
void displayc()
{System.out.println("This is circle shape");}
}

class Rectangle extends Shape{
void displayr()
{System.out.println("This is rectangle shape");}
}

class Square extends Rectangle{
void displaysq()
{System.out.println("Square is a rectangle");}
}


class ShapeMain{
public static void main(String args[]){
Square sq=new Square();
sq.displayr();
sq.displays();


System.out.println("SIA GUPTA 24CSU201");
}}