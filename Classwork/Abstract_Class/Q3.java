abstract class Animal{
abstract void makeSound();
}

class Dog extends Animal{
void makeSound()
{System.out.println("Dog says woof woof");}
}

class Cat extends Animal{
void makeSound()
{System.out.println("Cat says meow meow");}
}

class Cow extends Animal{
void makeSound()
{System.out.println("Cow says moo moo");}
}

class Q3{
static public void main(String args[]){
Animal animal[]={new Dog(), new Cat(), new Cow()};
for(Animal a:animal)
{ a.makeSound(); }
}}