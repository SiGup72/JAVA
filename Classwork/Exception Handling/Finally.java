import java.lang.Throwable;
class Finally{
public static void main(String args[]){
try{
try{
int a=10/0;
System.out.println("Inside try block(with exception)"+a);
}
catch(ArithmeticException e){
System.out.println("Exception handled in catch block");
}
finally{
System.out.println("Finally block");
}
try{
System.out.println("try block with no exception and return");
return;
}
catch(Exception e){
System.out.println("Exception handled in catch block");
}
finally{
System.out.println("finally block");
}
}
finally{
System.out.println("Program continues...");
}
}}