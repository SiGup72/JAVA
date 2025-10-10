interface A{
void display1();
}

interface B{
void display2();
}

interface C extends A,B{
void display3();
}

class D implements C{
public void display1(){
System.out.println("display1 of interface A called");
}
public void display2(){
System.out.println("display2 of interface B called");
}
public void display3(){
System.out.println("display3 of interface C called");
}
}

class InterMain{
public static void main(String args[]){
D d=new D();
d.display1();
d.display2();
d.display3();
System.out.println("SIA GUPTA 24CSU201");
}}