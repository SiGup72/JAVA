# Java Inheritance and Polymorphism Assignment

This folder contains Java programs that demonstrate the concepts of **inheritance, method overriding, constructors, and polymorphism**.

The assignment demonstrates:

- Creating parent and child classes  
- Method overriding and inheritance  
- Use of `super` keyword in constructors  
- Encapsulation with getters and setters  
- Polymorphic behavior using objects of derived classes  

## Programs

### 1. Shape, Rectangle, Circle, and Square
- **Shape.java** – Parent class  
- **Rectangle.java** – Child class of `Shape`.  
- **Circle.java** – Child class of `Shape`. 
- **Square.java** – Subclass of `Rectangle`.
- **Main.java** – Demonstrates calling methods of `Shape` and `Rectangle` using a `Square` object.  

---

### 2. Vehicle, Car, and Bike
- **Vehicle.java** – Parent class with `display()` method to print `"This is a Vehicle"`.  
- **Car.java** – Inherits `Vehicle`, overrides `display()` to print `"This is a Car"`.  
- **Bike.java** – Inherits `Vehicle`, overrides `display()` to print `"This is a Bike"`.  
- **MainVehicle.java** – Reads integer `N` (tyres) and creates appropriate object:  
  - If `N = 2`, creates a `Bike` object  
  - If `N = 4`, creates a `Car` object  
  - Otherwise, creates a `Vehicle` object
    
---

### 3. Box and BoxWeight
- **Box.java** – Defines width, height, and depth. 
- **BoxWeight.java** – Extends `Box` to include weight. 
- **BoxWeightDemo.java** – Tests functionalities of `Box` and `BoxWeight` by creating objects using different constructors and displaying volume and weight.  

