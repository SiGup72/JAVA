class Demo{
public static void main(String args[]) {
Circle c=new Circle(4.2);
System.out.println("Perimeter: "+ c.getPerimeter());
System.out.println("Area: "+ c.getArea());
System.out.println();

ResizableCircle rc = new ResizableCircle(9.6);
System.out.println("Original Perimeter: "+ rc.getPerimeter());
System.out.println("Original Area: "+ rc.getArea());
rc.resize(50);
System.out.println("New Perimeter: "+rc.getPerimeter());
System.out.println("New Area: "+rc.getArea());
System.out.println("SIA GUPTA 24CSU201");
}
}
