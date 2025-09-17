import java.util.Scanner;
class BoxWeightDemo {
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
System.out.println("Enter the width, height, depth and weight of the box");
float w=scan.nextFloat();
float h=scan.nextFloat();
float d=scan.nextFloat();
float we=scan.nextFloat();

BoxWeight box1=new BoxWeight();
System.out.println("Using default constructor is ");
box1.display();
System.out.println();
System.out.println("After setting their values is ");
box1.setDim(w,h,d);
box1.setWeight(we);
box1.display();
System.out.println();

BoxWeight box2=new BoxWeight(6,6,2,10);
System.out.println("Using parametrised constructor is ");
box2.display();
System.out.println();

BoxWeight box3=new BoxWeight(box2);
System.out.println("Using copy constructor");
box3.display();

System.out.println("SIA GUPTA 24CSU201");

}}
