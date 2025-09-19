class Point{
double x;
double y;

Point()
{x=0.0;
y=0.0;}

Point(double x, double y)
{this.x=x;
this.y=y; }

double getx()
{return x;}
 
double gety()
{return y;}

void set(double a, double b)
{x=a;
y=b;}

static double Distance(Point p1, Point p2)
{double dx = p2.x - p1.x;
double dy = p2.y - p1.y;
return Math.sqrt(dx * dx + dy * dy);}

void display() {
System.out.printf("(%7.2f, %7.2f)%n", x, y); }

}