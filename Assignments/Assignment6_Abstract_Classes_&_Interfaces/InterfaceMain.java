interface A{
void display1();
}

interface B extends A{
void display2();
}

class C implements A{
public void display1(){
System.out.println("display1 of interface A called");
}
public void display2(){
System.out.println("display2 of interface B called");
}
}

class InterfaceMain{
public static void main(String args[]){
C c=new C();
c.display1();
c.display2();
System.out.println("SIA GUPTA 24CSU201");
}}