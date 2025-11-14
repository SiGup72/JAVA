class Outer{

static class Inner {
static void display()
{System.out.println("Hello, This is a message."); } }
}

 class StaticNestedclass
{
public static void main(String args[])
{
Outer.Inner obj=new Outer.Inner();
obj.display();
}}