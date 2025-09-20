class Shape{
void draw()
{System.out.println("Drawing shape");}
}

class Circle extends Shape{
void draw()
{System.out.println("Drawing Circle");}
}

class Square extends Shape{
void draw()
{System.out.println("Drawing Square");}
}

class ShapeMain{
public static void main(String args[]){
Shape c=new Circle();
Shape s=new Square(); //using shape instead of circle and square demonstartes polymorphism
c.draw();
s.draw();
}}