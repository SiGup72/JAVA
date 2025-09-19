class  Triangle{
double s1;
double s2;
double s3;
Triangle()
{s1=3;
s2=4;
s3=5;}

public static void main(String args[])
{ Triangle t1=new Triangle();
double perimeter=t1.s1+t1.s2+t1.s3;
double s=perimeter/2;
double area= Math.sqrt(s*(s-t1.s1)*(s-t1.s2)*(s-t1.s3));
System.out.println("Perimeter is: "+perimeter);
System.out.println("Area is: "+area);
System.out.println("SIA GUPTA 24CSU201");
}
}