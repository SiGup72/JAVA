class A{
void display()
{System.out.println("display of Class A called"); }
}

interface C{
void show();
}

interface D{
void write(); 
}

class B extends A implements C,D{
public void show(){
System.out.println("show of interface C called");
}

public void write(){
System.out.println("write of interface D called");
}
}

class Main{
static public void main(String args[]){
B b=new B();
b.display();
b.show();
b.write();
System.out.println("SIA GUPTA 24CSU201");
}}
