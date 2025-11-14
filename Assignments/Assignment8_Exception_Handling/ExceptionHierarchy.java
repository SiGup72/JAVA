import java.lang.Throwable;
//first level class
class FirstLevel extends Exception{
public FirstLevel(String message){
super(message); }
}

//second level class
class SecondLevel extends FirstLevel{
public SecondLevel(String message){
super(message); }
}

//third level class
class ThirdLevel extends SecondLevel{
public ThirdLevel(String message){
super(message); }
}

//base class A
class A{
void show() throws FirstLevel{
throw new FirstLevel("Exception from class A, First level"); }
}

//class B
class B extends A{
void show() throws SecondLevel{
throw new SecondLevel("Exception from class B, Second Level"); }
}

//class C
class C extends B{
void show() throws ThirdLevel{
throw new ThirdLevel("Exception from class C, Third Level"); }
}
 
//main class 
public class ExceptionHierarchy{
public static void main(String args[]){
A obj=new C();
try{
obj.show();
}
catch(FirstLevel e){
System.out.println("Caught Exception: "+e); }
finally{
System.out.println("SIA GUPTA 24CSU201"); }
}}