import java.util.Scanner;

class Distance{
public static void main(String args[])
{Scanner scan=new Scanner(System.in);
System.out.println("Enter x1 and y1:");
double x1 = scan.nextDouble();
double y1 = scan.nextDouble();
System.out.println("Enter x2 and y2:");
double x2 = scan.nextDouble();
double y2 = scan.nextDouble();
Point p1 = new Point(x1, y1);
Point p2 = new Point(x2, y2);
System.out.print("Point 1: ");
p1.display();
System.out.print("Point 2: ");
p2.display();
double dist = Point.Distance(p1, p2);
System.out.printf("Distance between two points: %.2f%n", dist);
System.out.println("SIA GUPTA 24CSU201");
}
}