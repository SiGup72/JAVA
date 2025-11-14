import java.lang.Throwable;
class NullString{
public static void main(String args[]){
try{
String s=null;
System.out.println("String length:"+s.length());
}
catch(NullPointerException e){
System.out.println("NullPointerException, cannot find length of a null string");
}
System.out.println("Program continues...");
}}