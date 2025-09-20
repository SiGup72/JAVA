class Vehicle{
String brand;

Vehicle(String brand)
{System.out.println("Vehicle constructor called");
this.brand=brand;
System.out.println("Brand:"+brand);}
}

class Car extends Vehicle{
String field_model;
Car(String brand, String fm)
{super(brand);
field_model=fm;
System.out.println("Car constructor called");
System.out.println("Field Model:"+field_model); }
}

class Carmain{
public static void main(String args[]){
Car car=new Car("Toyota","ABC");
}
}
